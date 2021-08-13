import { Component, OnInit } from '@angular/core';
import { Router} from '@angular/router';

import { AccountsService} from '../services/accounts/account.service';

@Component({

   moduleId: module.id,
   selector: 'app-verify-screen',
  templateUrl: './success-screen.component.html',
})
export class DsuccessScreenComponent implements OnInit {
    


  

  constructor(private router: Router, accountsService: AccountsService ) 
  
  {
  
  
   }
   

  ngOnInit() {
   console.log(this.obj);

   this.accountsService.createBenefeciary(this.obj).subscribe( data => {
     
     
     
          console.log(this.obj);
             
          
        });

  }


goToDashboard(){

this.router.navigate(['/userprofile']);



}





}
