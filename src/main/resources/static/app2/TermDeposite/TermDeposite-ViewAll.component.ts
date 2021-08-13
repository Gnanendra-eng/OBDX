import { Component, OnInit } from '@angular/core';
import { AccountsService} from '../services/accounts/account.service';

@Component({

  moduleId: module.id,
  selector: 'app-TermViewAll-activity',
  templateUrl: './TermDeposite-ViewAll.component.html'
 
})
export class TermDepositeViewAllComponent implements OnInit {


loanDetails = {};

  constructor(private accountsService: AccountsService) { 
  
  this.accountsService.getAccounts().subscribe(data => this.loanDetails = data);
  
  
  
  }

  ngOnInit() {
  }
  
  
  selectedLoan(loan){
  
  this.accountsService.setSelecetd_Beneficiary(loan);
  

  
  }
  
  
  
  
  

}
