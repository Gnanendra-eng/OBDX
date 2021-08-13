import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { DatePipe } from '@angular/common';

import { AppComponent }  from './app.component';
import { routing }        from './app.routing';
import { HttpModule } from '@angular/http';
import { DashboardComponent } from './dashboard/dashboard.component';
import { AccountSummary } from './accounts/account-summary';
import { AccountsService} from './services/accounts/account.service';
import { IntilizeScreenComponent } from './OwnAccount/intilize-screen.component';
import { VerificationScreenComponent } from './OwnAccount/verification-screen.component';
import { ConfirmScreenComponent } from './OwnAccount/confirm-screen.component';
import { SuccessScreenComponent } from './OwnAccount/success-screen.component';
import { AddPayeeSuccessComponent } from './Domestic/add-payee-success.component';
import { MyDirectiveDirective } from './Domestic/my-directive.directive';


import { DsuccessScreenComponent } from './Domestic/success-screen.component';
import { IntiScreenComponent } from './Domestic/inti-screen.component';
import { AddPayeeFormComponent } from './Domestic/add-payee-form.component';
import { AddpayeeverfyComponent } from './Domestic/addpayeeverfy.component';
import { VerfyScreenComponent } from './Domestic/verfy-screen.component';
import { DomesticConfirmComponent } from './Domestic/domestic-confirm.component';
import { ReactiveFormsModule } from '@angular/forms';
import { FormsModule } from '@angular/forms';
import { TabsComponent } from './payments/tabs.component';
import { LoanDetailsComponent } from './Loans/loan-details.component';
import { LoanSummaryComponent } from './Loans/loan-summary.component';
import { LoanActivityComponent } from './Loans/loan-activity.component';
import { LoanViewAllComponent } from './Loans/loan-ViewAll.component';
import { TermDepositeDetailsComponent } from './TermDeposite/term-deposite-details.component';
import { TermDepositeSummaryComponent } from './TermDeposite/tabdep.component';
import { TermDepositeViewAllComponent } from './TermDeposite/TermDeposite-ViewAll.component';
import { TermDepositeActivityComponent } from './TermDeposite/TermDeposite-activity.component';





@NgModule({
    imports: [
        BrowserModule,
        HttpModule,
        routing,
        ReactiveFormsModule,
        FormsModule
     
    ],
    declarations: [
        AppComponent,
       	DashboardComponent,
       	AccountSummary,
       	IntilizeScreenComponent,
       	VerificationScreenComponent,
        ConfirmScreenComponent ,
        IntiScreenComponent,
        AddPayeeFormComponent,
        AddpayeeverfyComponent,
        VerfyScreenComponent,
        DomesticConfirmComponent,
        TabsComponent,
        LoanDetailsComponent,
        LoanSummaryComponent,
        LoanActivityComponent,
        LoanViewAllComponent,
        TermDepositeDetailsComponent,
        SuccessScreenComponent,
        AddPayeeSuccessComponent,
        DsuccessScreenComponent,
        TermDepositeSummaryComponent,
        TermDepositeViewAllComponent,
        TermDepositeActivityComponent,
        MyDirectiveDirective
     
 
      
    ],
     providers: [
        AccountsService,
        DatePipe
     
        
    ],
    bootstrap: [AppComponent ]
   
   
})

export class AppModule { }