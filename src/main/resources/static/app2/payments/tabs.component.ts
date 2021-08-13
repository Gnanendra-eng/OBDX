import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-tabs',
   moduleId: module.id,
  templateUrl: './tabs.component.html',
  styleUrls: ['./tabs.component.css']
 
})
export class TabsComponent implements OnInit {


OwnAccount = true;
DomesticAccount = false;

  constructor() { }

  ngOnInit() {
  }
  
  
goToTab1(){
  
this.OwnAccount = true;
this.DomesticAccount = false;


  
  }
  
goToTab2(){
  
this.OwnAccount = false;
this.DomesticAccount = true;
  
  }
  
  
  
  
  

}
