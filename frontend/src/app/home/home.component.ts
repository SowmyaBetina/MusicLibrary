import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {
  albums: any[] =[];

  constructor(private router: Router) {}

  // onAlbumClick(albumId: number) {
  //   this.router.navigate(['recent']);
  // }

  onAlbumClick(id : number) {
    this.router.navigate(['/song-list',{id:id}]);
  }
}
