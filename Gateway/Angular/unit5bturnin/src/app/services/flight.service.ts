import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { Flight } from '../components/models/flight';

@Injectable({
  providedIn: 'root'
})
export class FlightService {

  constructor(private http: HttpClient) { }

  endpoint = "http://flightapp.christianhur.com/flights/";

  //Get All
  getFlights(): Observable<any>{
    return this.http.get(this.endpoint);
  }

  //Get One
  getFlight(id:number):Observable<any> {
    return this.http.get(this.endpoint + id) 
  }
// add a single record to the database
  addFlight(flight:Flight):Observable<any> {
    return this.http.post(this.endpoint,flight)
  }
// delete a single record
deleteFlight(id:number):Observable<any> {
  return this.http.delete(this.endpoint+id)
}   
// delete all records   
deleteFlights():Observable<any> {
  return this.http.delete(this.endpoint) 
}               
 // update a single record
updateFlight(id:number,flight:Flight):Observable<any> { 
 return this. http.put(this.endpoint+id,flight)}   
}
