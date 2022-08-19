import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

import { EstadosService } from './services/estados/estados.service';
import { PaisesService } from './services/paises/paises.service';
import { PessoasService } from './services/pessoas/pessoas.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
})
export class AppComponent implements OnInit {
  title = 'Pessoas';
  paises: any;
  estados: any;
  pessoas: any;
  pessoaForm: FormGroup;

  constructor(
    private fb: FormBuilder,
    private estadosService: EstadosService,
    private paisesService: PaisesService,
    private pessoaService: PessoasService,
  ) {
    this.pessoaForm = this.fb.group({
      id: [''],
      nome: ['', Validators.required],
      sobrenome: ['', Validators.required],
      idade: ['', Validators.required],
      pais: ['', Validators.required],
      estado: ['', Validators.required],
    });

    this.paisesService.getAllPaises().subscribe(
      (response) => {
        this.paises = response;
      },
      (error) => {
        console.error(error);
      }
    );

    this.pessoaService.getAllPessoas().subscribe(
      (response) => {
        this.pessoas = response;
      },
      (error) => {
        console.error(error);
      }
    );

    this.pessoaForm.get('pais')?.valueChanges.subscribe((value) => {
      this.estadosService.getAllEstadosByPais(value.id).subscribe(
        (response) => {
          this.estados = response;
        },
        (error) => {
          console.error(error);
        }
      );
    });
  }

  cadastrar(): void {
    this.pessoaService.savePessoa(this.pessoaForm.value).subscribe(
      (response) => {
        this.pessoaForm.reset();
        this.pessoas = this.pessoas.filter(
          (pessoa: any) => response.id !== pessoa.id
        );
        this.pessoas.push(response); //assincrono
      },
      (error) => {
        console.error(error);
      }
    );
  }

  remover(pessoa: any): void {
    this.pessoaService.deletePessoa(pessoa.id).subscribe( (response) => {
      if (response === true) {
        this.pessoas.pop(pessoa);
      }
      document.location.reload();
    });
  }

  editar(pessoa: any): void {
    this.pessoaForm.setValue({
      id: pessoa.id,
      nome: pessoa.nome,
      sobrenome: pessoa.sobrenome,
      idade: pessoa.idade,
      pais: pessoa.pais,
      estado: pessoa.estado,
    });
  }

  ngOnInit(): void {}
}
