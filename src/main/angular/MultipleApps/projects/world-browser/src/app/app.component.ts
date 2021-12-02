import {Component, OnInit} from '@angular/core';
import {MenuItem, PrimeNGConfig} from 'primeng/api';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  menuBar: MenuItem[] = [];

  constructor(private primengConfig: PrimeNGConfig) {}

  ngOnInit() {
    this.primengConfig.ripple = true;
    this.menuBar = [
      {
        label: 'Countries',
        items: [
          {
            label: 'Hungary'
          },
          {
            label: 'Germany'
          }
        ]
      },
      {
        label: 'Counties',
        items: [
          {
            label: 'Pest'
          },
          {
            label: 'Baranya'
          }
        ]
      },
      {
        label: 'Cities',
        items: [
          {
            label: 'Budapest'
          },
          {
            label: 'Pécs'
          }
        ]
      }
    ];
  }
}
