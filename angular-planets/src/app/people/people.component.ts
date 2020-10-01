import { Component, OnInit } from '@angular/core';
import { Person } from '../person'
@Component({
  selector: 'app-people',
  templateUrl: './people.component.html',
  styleUrls: ['./people.component.css']
})
export class PeopleComponent implements OnInit {

  constructor() { }

  people: Person = {
    id: 1,
    name: 'Diego Chacon',
    heigth: 1.85,
    home_planet: 'Tierra'
  };


  ngOnInit(): void {
  }

}
