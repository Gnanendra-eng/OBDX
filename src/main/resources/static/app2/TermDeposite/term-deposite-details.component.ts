import { Component, OnInit } from '@angular/core';
import { AccountsService} from '../services/accounts/account.service';

@Component({

      moduleId: module.id,
  selector: 'app-term-deposite-details',
  templateUrl: './term-deposite-details.component.html'

})
export class TermDepositeDetailsComponent implements OnInit {

selecetd ={};
hide = true;

  constructor(private accountsService: AccountsService) { 
  
   this.selecetd=this.accountsService.getSelecetd_Beneficiary();
 
   
  
  }

  ngOnInit() {
  }

}
