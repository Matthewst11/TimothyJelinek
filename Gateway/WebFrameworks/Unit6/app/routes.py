from flask import render_template
from app import app

@app.route('/')

@app.route('/portfolio')
def portfolio():
    projects= [
        { 
            "id" : "1",
            "title" : "Great Gatsby",
            "rating" : "Good"
    },
    {
            "id" : "2",
            "title" : "Clifford the Big Red Dog",
            "rating" : "Bad"
    },
    {
            "id" : "3",
            "title" : "Star Wars",
            "rating" : "Best"
    }
    ]
    return render_template('portfolio.html', title='Portfolio', projects=projects)

@app.route('/index')
def index():
    user = {'username' : 'Miguel'}
    posts= [
        { 
            'author': {'username': 'John'},
            'body': 'Beautiful Day in Portland!'
    },
    {
            'author': {'username': 'Susan'},
            'body': 'The Avengers movie was so cool!'
    }
    ]
    return render_template('index.html', title='Home', user=user, posts=posts)