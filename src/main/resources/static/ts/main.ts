//main entry point
import {bootstrap} from 'angular2/platform/browser';
import {provide, bind} from 'angular2/core';
import {ROUTER_PROVIDERS, ROUTER_BINDINGS} from 'angular2/router';

import {App} from 'ts/app.ts';

bootstrap(App, [
  ROUTER_PROVIDERS
]);