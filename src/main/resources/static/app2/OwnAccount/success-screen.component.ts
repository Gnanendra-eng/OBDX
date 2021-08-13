import { Component, OnInit } from '@angular/core';

@Component({
  moduleId: module.id,
  templateUrl: './success-screen.component.html',

})
export class SuccessScreenComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

 
  
  getVerfiScreen(){
   this.router.navigate(['userprofile']);
  }

}
