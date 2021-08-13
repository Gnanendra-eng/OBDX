import { Component, OnInit } from '@angular/core';

@Component({

  moduleId: module.id,
  selector: 'app-loan-activity',
  templateUrl: './TermDeposite-activity.component.html'
 
})
export class TermDepositeActivityComponent implements OnInit {

hide=true;

  constructor() { }

  ngOnInit() {
  }
  
  
  
  getActivityDetails(){
  
  this.hide=false;
  
  }
  
  

}
