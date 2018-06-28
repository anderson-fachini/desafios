import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';
import { Platform } from 'ionic-angular';


@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {

  allPlatforms: Array<Object>;
  currentPlatforms: Array<String>;

  constructor(public navCtrl: NavController, public plt: Platform) {
    this.currentPlatforms = plt.platforms();
    this.allPlatforms = [
      {
        name: "android",
        description: "on a device running Android."
      },
      {
        name: "cordova",
        description: "on a device running Cordova."
      },
      {
        name: "core",
        description: "on a desktop device."
      },
      {
        name: "ios",
        description: "on a device running iOS."
      },
      {
        name: "ipad",
        description: "on an iPad device."
      },
      {
        name: "iphone",
        description: "on an iPhone device."
      },
      {
        name: "mobile",
        description: "on a mobile device."
      },
      {
        name: "mobileweb",
        description: "in a browser on a mobile device."
      },
      {
        name: "phablet",
        description: "on a phablet device."
      },
      {
        name: "tablet",
        description: "on a tablet device."
      },
      {
        name: "windows",
        description: "on a device running Windows."
      }
    ];


  }
}
