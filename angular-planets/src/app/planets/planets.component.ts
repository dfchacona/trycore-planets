import { Component, OnInit } from '@angular/core';
import { Planet } from '../planet'
@Component({
  selector: 'app-planets',
  templateUrl: './planets.component.html',
  styleUrls: ['./planets.component.css']
})
export class PlanetsComponent implements OnInit {

  constructor() { }

  planet: Planet = {
    id: 1,
    name: 'Tierra',
    diameter: 3000,
    mean_temperature: 30.
  };

  ngOnInit(): void {
  }

}
