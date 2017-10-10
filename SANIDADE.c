/*  Ciência da Computação - UFPB
    Aluno(a): Julianny Meireles Andrade  Matrícula: 2016000248
    Só da Sana, já mudei os valores do boolean mas dá sempre a msm coisa, ele deve ta pulando alguma coisa
*/

#include <stdio.h>
#include <stdlib.h>

#define ULL unsigned long long

typedef struct no{
	ULL int conteudo;
	ULL int proximo;
	ULL int anterior;
}tNo;

int main() {
	ULL conteudo, proximo, anterior;


	tNo ptr1, ptr2;
	tNo *novo = (tNo *) malloc(sizeof(tNo));
	tNo *Proximo_lista;
	tNo *Anterior_lista;
    tNo aux1, aux2;

	int count = 1;
	int pos = 0;

enum diferenciador {
    true = 1, false = 0
};
typedef  enum diferenciador  bool;

    bool dif = true;

	while(scanf(" %llx %llx %llx", &conteudo, &proximo, &anterior) == 3) {
		novo[pos].conteudo = conteudo;
		novo[pos].proximo = proximo;
		novo[pos].anterior = anterior;

		if(pos == 0)
			ptr1 = novo[pos];
		else if(pos == 1)
			ptr2 = novo[pos];

		pos++;
        count++;


		novo = (tNo *) realloc(novo, count * sizeof(tNo));

	}

	int i = 1;
	int j = 2;

	Proximo_lista = (tNo *) malloc(j * sizeof(tNo));
	Proximo_lista[0] = ptr1;

	for(aux1 = ptr1; aux1.conteudo != ptr2.conteudo;) {
		for(int p = 0; p < (count-1); p++) {
			if(aux1.proximo == novo[p].conteudo) {
				aux1 = novo[p];
				Proximo_lista[i] = aux1;
				i++;
				j++;
				Proximo_lista = (tNo *) realloc(Proximo_lista, j * sizeof(tNo));
				break;
			}

			dif = false;
		}
		if(!dif)
			break;
	}

	Proximo_lista = (tNo *) realloc(Proximo_lista, i * sizeof(tNo));

	Anterior_lista = (tNo *) malloc(i * sizeof(tNo));
	Anterior_lista[0] = ptr2;
	i = 1;

	if(dif)
		for(aux2 = ptr2; aux2.conteudo != ptr1.conteudo;) {
			for(int p = 0; p < (count-1); p++) {
				if(aux2.anterior == novo[p].conteudo) {
					aux2 = novo[p];
					Anterior_lista[i] = aux2;
					i++;
					break;
				}

				dif = false;
			}
			if(!dif)
				break;
		}

	if(dif)
		for(j = i-1, i = 0; j >= 0; i++, j--) {
			if(Proximo_lista[i].conteudo != Anterior_lista[j].conteudo) {
				dif = 0;
				break;
			}
		}

	if(dif == true)
		printf("SANA\n");
	else
		printf("INSANA\n");

    system("pause");

	return 0;
}
