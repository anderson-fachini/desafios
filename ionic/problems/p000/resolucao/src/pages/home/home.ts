import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {

  titulo: String;
  cabecalho: String;
  conteudo: String;

  constructor(public navCtrl: NavController) {
    this.titulo = 'Desafios Ionic';
    this.cabecalho = 'Problema P000';
    this.conteudo = `O Ionic é um framework baseado em Angular e Cordova, contando com uma gama de plugins e funcionalidades nativas para
        criar e compilar uma aplicação mobile ou uma Progressive Web App.`;
  }
}
