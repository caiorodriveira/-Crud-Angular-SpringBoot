import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PessoasService {
  private API_SERVER = 'http://localhost:8080/pessoas/'

  constructor(private httpClient: HttpClient) { }

  public getAllPessoas(): Observable<any>{
    return this.httpClient.get(this.API_SERVER);
  }

  public savePessoa(pessoa:any): Observable<any>{
    return this.httpClient.post(this.API_SERVER, pessoa);
  }

  public deletePessoa(id:number): Observable<any>{
    return this.httpClient.delete(`${this.API_SERVER}delete/${id}`);
  }
}
