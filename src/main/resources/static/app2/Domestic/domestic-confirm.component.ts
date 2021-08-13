import { Router} from '@angular/router';
import { Component, OnInit, Input } from '@angular/core';
import { AccountsService} from '../services/accounts/account.service';

@Component({
 
  moduleId: module.id,
  selector: 'app-confirm-screen',
  templateUrl: './domestic-confirm.component.html',
  

})
export class DomesticConfirmComponent implements OnInit {

 domestic_details;


  constructor(private router: Router , private accountsService: AccountsService) {
  
  this.domestic_details=this.accountsService.getSelecetd_Beneficiary();
    
   }

  ngOnInit() {
  }
  
  
  
  getConfirmAlert(){
   
   this.accountsService.setDomesticTransfer(this.domestic_details).subscribe( data => {
         
        });
        this.router.navigate(['/tabs/Doemstic-Success']);
  }
  
  
goToAddScreen(){

this.router.navigate(['userprofile']);

}
  

}
