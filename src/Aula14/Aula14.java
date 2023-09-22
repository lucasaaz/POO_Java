package Aula14;

import java.util.Scanner;

public class Aula14 {

	public static void main(String[] args) {
		
		
		//================================VIDEO=====================================
	
	
		//Criar quantidade de videos
		Scanner teclado = new Scanner(System.in);
		System.out.printf("Digite o numero de videos que serão criados: ");
		int total = teclado.nextInt();
		System.out.printf("\n");
		
		//Criação
		Video[] v = new Video[total];
		
		//Nome dos Filmes criados
		int i = 0;
		int y = 1;
		for(i=0; i<total; i++) {
			
			System.out.printf("Digite o nome do " + y + "° video: ");
			String nome = teclado.next();
			
			v[i] = new Video(nome);
			y++;
		}
				
		//Acao a Ser Executada no Filme
		Scanner teclado2 = new Scanner(System.in);
		
		System.out.printf("\n");
		System.out.printf("Deseja executar alguma ação? sim[1]/não[2] ");
		int decisao = teclado2.nextInt();
		
		if( decisao == 1) {
		
			int parar = 1;
			do {
					System.out.println("\nEscolha um dos Filmes abaixo: ");
					for(i=0; i<total; i++) {
						System.out.println("Filme: " + "[" + i + "]" + v[i]);
					}	
					System.out.printf("Qual numero do Filme escolhido: ");
					int nFilme = teclado2.nextInt();
				
					System.out.printf("\n");
					System. out. printf("[1]Play \n[2]Pause \n[3]Curtir \n[4]Sair \nEscolha o comando: ");
					int opcao = teclado2. nextInt();		
					if( opcao == 1) {
						v[nFilme].play();
					}else if( opcao == 2) {
						v[nFilme].pause();
					}else if( opcao == 3) {
						v[nFilme].like();
					}else if( opcao == 4) {
						parar = 4;
					}
		
			}while(parar != 4 );	
			
			}else {		
				
		}
		
		//Mostrar INFO do Video
		for(i=0; i<total; i++) {
			System.out.println("\nINFO do Video:");
			System.out.println(v[i].toString());	
		}		
		System.out.println("\n" + total + " Filmes criados com sucesso!!!\n");
		System.out.println("-------------------------------------------------------\n");
		
		
		//================================endVIDEO=====================================
		
		
		
		
		
		//================================GAFANHOTO====================================
		
		
		//Criar quantidade de Pessoas
		Scanner teclado3 = new Scanner(System.in);
		System.out.printf("Quantidade de pessoas a serem criadas: ");
		int quantPessoas = teclado3.nextInt();
		
		//Criação
		Gafanhoto[] g = new Gafanhoto[quantPessoas];
		
		//Nome das Pessoas criadas
		int i2;
		int y2 = 1;
		for(i2=0; i2<quantPessoas; i2++) {
			//Pessoa
			System.out.println
			(y2 + "° Pessoa");
			y2++;
			
			//Nome
			System.out.printf("Nome: ");
			String nome = teclado3.next();
			
			//Idade
			System.out.printf("Idade: ");
			int idade = teclado3.nextInt();
			
			//Sexo
			System.out.printf("Sexo: ");
			String sexo = teclado3.next();
			
			//Usuario
			System.out.printf("Usuario: ");
			String usuario = teclado3.next();
			System.out.printf("\n");
			
			g[i2] = new Gafanhoto(nome, idade, sexo, usuario);
		}
		
		//Mostrar INFO  das pessoas
		System.out.println("\nINFO Gafanhoto:");
		for(i2=0; i2<quantPessoas; i2++) {
			System.out.println(g[i2].toString());
		}
		System.out.println("\n" + quantPessoas + " pessoas criadas com sucesso!!!");
		System.out.println("\n-------------------------------------------------------");

		
		//===============================endGAFANHOTO==================================	
		
		
		
		
		
		
		//===============================VISUALIZACAO==================================
		
			
		//Quantidade de Visualizacoes
		Scanner teclado4 = new Scanner(System.in);
		System.out.printf("\nQuantas visualizacoes quer fazer: ");
		int quantVisu = teclado4.nextInt();
		
		//Criacao
		Visualizacao[] vis = new Visualizacao[quantVisu];
		
		//Escolher Visualizacao com PESSOA / VIDEO
		int i4;
		for(i4=0; i4<quantVisu; i4++) {
			
			//Mostrar PESSOAS
			int i3;
			System.out.printf("\n");
			for(i3=0; i3<quantVisu; i3++) {
				System.out.println("[" + i3 + "] " + g[i3].getNome());
			}
			System.out.printf("Escolher a pessoa: ");
			int pessoaEsc = teclado4.nextInt();
			
			//Mostrar VIDEOS
			int i3b;
			System.out.printf("\n");
			for(i3b=0; i3b<quantVisu; i3b++) {
				System.out.println("[" + i3b + "] " + v[i3b].getTitulo());
			}	
			System.out.printf("Escolher o video: ");
			int videoEsc = teclado4.nextInt();
					
			vis[i4] = new Visualizacao(g[pessoaEsc], v[videoEsc]);
			
			System.out.printf("\nDeseja Avaliar video: sim[1]/não[2] ");
			int avaliar = teclado4.nextInt();
			
			if( avaliar == 1) {
				
				System.out.printf("\nEscolher avaliação manual[1] ou por porcentagem[2]: ");
				int tipoAvaliar = teclado4.nextInt();
				
				if(tipoAvaliar == 1) {
					System.out.printf("Manual: ");
					int manual = teclado4.nextInt();
					vis[i4].avaliar(manual);
				}else if(tipoAvaliar == 2) {
					System.out.printf("Porcentagem: ");
					float porcentagem = teclado4.nextFloat();
					vis[i4].avaliar(porcentagem);
				}
				
			}else {
				vis[i4].avaliar();
			}

		}
		
	 	//Mostrar INFO  das VISUALIZACOES
		int i5;
		System.out.println("\nINFO Visualizacao:");
		for(i5=0; i5<quantPessoas; i5++) {
			System.out.println(vis[i5].toString());
		}
		
		System.out.println("\n" + quantVisu + " avaliações foram feitas com sucesso!!!");
		System.out.println("\n-------------------------------------------------------\n");
		
		
		//==============================endVISUALIZACAO================================	
		
		
		
		
	}//endMain
	
}//endAula14
