import sqlite3
import pandas as pd
from sqlalchemy import create_engine, Column, Integer, String, Float, ForeignKey
from sqlalchemy.ext.declarative import declarative_base
from sqlalchemy.orm import sessionmaker, relationship

with sqlite3.connect(":memory:") as con:
    c = con.cursor()
    
    c.execute('''CREATE TABLE sensors (date text, city text, code text, sensor_id real, temperature real)''')

    for table in c.execute("SELECT name FROM sqlite_master WHERE type = 'table'"):
        print("Table", table[0])

    c.execute("INSERT INTO sensors VALUES ('2016-11-05','Utrecht','Red',42,15.14)")

    c.execute("INSERT INTO sensors VALUES ('2018-10-10','Bin','Blue',30,17.17)")

    c.execute("SELECT * FROM sensors")
    print(c.fetchone())

    c.execute("SELECT * FROM sensors")
    print(c.fetchone())

    c.execute("DROP TABLE sensors")

    print("# of tables", c.execute("SELECT COUNT(*) FROM sqlite_master WHERE type = 'table'").fetchone()[0])

    c.close()

data = [
    (1, '1710', 'Low', 16),
    (2, '1801', 'Medium', 18),
    (3, '1902', 'High', 20),
    (4, '2003', 'Low', 17),
    (5, '2104', 'Medium', 19),
    (6, '2205', 'High', 21),
]

with sqlite3.connect(":memory:") as con:
    c = con.cursor()

    c.execute('''CREATE TABLE sun_activity (
                    id INTEGER PRIMARY KEY,
                    year TEXT,
                    sunactivity TEXT,
                    value REAL
                )''')

    c.executemany("INSERT INTO sun_activity (id, year, sunactivity, value) VALUES (?, ?, ?, ?)", data)

    c.execute("SELECT COUNT(*) FROM sun_activity")
    print("Row count:", c.fetchone()[0])
    
    c.execute("DELETE FROM sun_activity WHERE sunactivity = 'High' AND value > 20")
    
    df = pd.read_sql_query("SELECT * FROM sun_activity WHERE year < '1732'", con)
    print(df)

Base = declarative_base()

class Station(Base):
    __tablename__ = 'stations'
    id = Column(Integer, primary_key=True)
    name = Column(String, nullable=False)
    location = Column(String, nullable=False)
    sensors = relationship('Sensor', back_populates='station')

class Sensor(Base):
    __tablename__ = 'sensors'
    id = Column(Integer, primary_key=True)
    sensor_id = Column(Integer, nullable=False)
    temperature = Column(Float, nullable=False)
    station_id = Column(Integer, ForeignKey('stations.id'))
    station = relationship('Station', back_populates='sensors')

engine = create_engine('sqlite:///:memory:')
Base.metadata.create_all(engine)

Session = sessionmaker(bind=engine)
session = Session()

station1 = Station(name='Station1', location='Location1')
station2 = Station(name='Station2', location='Location2')

session.add(station1)
session.add(station2)
session.commit()

sensor = Sensor(sensor_id=1, temperature=22.5, station_id=station1.id)
session.add(sensor)
session.commit()

print("Stations:")
for station in session.query(Station).all():
    print(f"ID: {station.id}, Name: {station.name}, Location: {station.location}")

print("\nSensors:")
for sensor in session.query(Sensor).all():
    print(f"ID: {sensor.id}, Sensor ID: {sensor.sensor_id}, Temperature: {sensor.temperature}, Station ID: {sensor.station_id}")

