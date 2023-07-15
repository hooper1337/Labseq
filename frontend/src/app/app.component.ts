import { Component } from '@angular/core';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Observable, catchError } from 'rxjs';



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})

export class AppComponent {
  inputValue: number = 0;
  textInput: String = '';

  constructor(private http: HttpClient) {}

  public getLabSequence(): Observable<any> {
    const url = `http://localhost:8080/labseq/${this.inputValue}`;
    return this.http.get<any>(url);
  }

  submit() {
      this.getLabSequence().subscribe(response => {
        this.textInput = response;
      },(error : HttpErrorResponse ) => {
        if(error.error.error == undefined)
        {
          this.textInput = error.error;
        }
        else
        {
          this.textInput = error.error.error;
        }
      })
    }
}





