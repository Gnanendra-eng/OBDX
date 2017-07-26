//our root app component
import {Component} from 'angular2/core'
import {RouteConfig, Router, Route,  ROUTER_DIRECTIVES} from 'angular2/router';
import {Login} from './login';
import {Dashboard} from './dashboard';


@Component({
  selector: 'my-app',
  template: `
   <h1>Wellcome To {{name}}</h1>
    <a [routerLink]="['Dashboard']">Dashboard</a> | 
    <a [routerLink]="['Login']">Login</a>
    <hr>
    <router-outlet></router-outlet>
  `,
  directives: [ROUTER_DIRECTIVES]
})
@RouteConfig([
   new Route({path: '/dashboard', name: 'Dashboard', component: Dashboard}),
   new Route({path: '/login', name: 'Login', component: Login, useAsDefault:true})
])
export class App {
  constructor(public router: Router) {
    this.name = 'Angular2 App'
  }
  reload(){
    location.reload();
  }
}