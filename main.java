package Apoio_solidario;

import java.util.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nomedeUsuario=null, cpf=null, nome=null, email=null, telefone=null,mensagem_apoiado=null, mensagem_apoiador=null;
		char opcaoUsuario, escolhaUsuario = 0;
		double avaliacao=0;
		int idade_apoiador=0, idade_apoiado=0, idApoiador=0, idApoiado=0, escolha_usuario=0,cont =0, j =0;
		
		
		
		Apoiador apoiador = new Apoiador(nome, idade_apoiador, email, telefone, cpf, avaliacao, idApoiador, mensagem_apoiador);
		Apoiado apoiado = new Apoiado(nome, idade_apoiado, email, telefone, cpf, idApoiado, nomedeUsuario, mensagem_apoiado);
		
		Map<String, String> disct_mensagem_apoiador = new HashMap <String, String>();
		Map<String, String> disct_mensagem_apoiado = new HashMap <String, String>();
		
		Scanner ler = new Scanner(System.in);
		Random aleatorio = new Random();
		System.out.println("======================== Bem vindo ao Abraço Solidário ===============================");

			//cadastro
			while (true)
				{
					System.out.println("Você gostaria de apoiar ou ser apoiado?");
					System.out.println("\n1 - Virar Apoiador\n2 - Preciso de apoio\n\nDigite uma das opções acima");
					escolha_usuario = ler.nextInt();
					ler.nextLine();
					
						if(escolha_usuario== 1)
						{
							
							System.out.println("Digite seu nome: ");
							nome = ler.nextLine();
							System.out.println("Digite seu idade: ");
							idade_apoiador = ler.nextInt();
							System.out.println("Digite seu email: ");
							email = ler.nextLine();
							ler.nextLine();
							System.out.println("Digite seu telefone: ");
							telefone = ler.nextLine();
							System.out.println("Digite seu cpf: ");
							cpf = ler.nextLine();
							idApoiador = aleatorio.nextInt();
																			
							apoiador.setNomeCompleto(nome);
							apoiador.setIdade(idade_apoiador);
							apoiador.setEmail(email);
							apoiador.setTelefone(telefone);
							apoiador.setCPF(cpf);
							apoiador.setIDapoiador(idApoiador);
							
							System.out.println("\n\n..... Aguarde enquanto achamos um apoiador para te ajudar ......\n\n");
							System.out.println("\n__________________________________________________________________________________________________\n");
							System.out.println("\n..... Em uma outra máquina, alguém está precisando de apoio e digita a opção 2 <3......\n\n");
							
							System.out.println("\nDigite seu nome: ");
							nome = ler.nextLine();
							System.out.println("Digite seu idade: ");
							idade_apoiado = ler.nextInt();
							System.out.println("Digite seu email: ");
							email = ler.nextLine();		
							ler.nextLine();
							System.out.println("Digite seu telefone: ");
							telefone = ler.nextLine();
							System.out.println("Digite seu cpf: ");
							cpf = ler.nextLine();
							System.out.println("Gostaria de colocar um nome de usuário diferente?: S(Sim) ou N(não)");
							opcaoUsuario = ler.nextLine().charAt(0);
							if (opcaoUsuario == 'S' || opcaoUsuario == 's')
							{
								System.out.println("Digite um nome de usuário: ");
								nomedeUsuario = ler.nextLine();
							}
							else
							{
								nomedeUsuario = "Anônimo";
							}
							idApoiado = aleatorio.nextInt();
										
							apoiado.setNomeCompleto(nome);
							apoiado.setIdade(idade_apoiado);
							apoiado.setEmail(email);
							apoiado.setTelefone(telefone);
							apoiado.setCPF(cpf);
							apoiado.setIdApoiado(idApoiado);
							apoiado.setNomedeUsuario(nomedeUsuario);
							
						}		

							
						if(escolha_usuario== 2)
						{

							
						
							System.out.println("\nDigite seu nome: ");
							nome = ler.nextLine();
							System.out.println("Digite seu idade: ");
							idade_apoiado = ler.nextInt();
							ler.nextLine();
							System.out.println("Digite seu email: ");
							email = ler.nextLine();
							ler.nextLine();
							System.out.println("Digite seu telefone: ");
							telefone = ler.nextLine();
							System.out.println("Digite seu cpf: ");
							cpf = ler.nextLine();
							System.out.println("Gostaria de colocar um nome de usuário diferente?: S(Sim) ou N(não)");
							opcaoUsuario = ler.nextLine().charAt(0);
							if (opcaoUsuario == 'S' || opcaoUsuario == 's')
							{
								System.out.println("Digite um nome de usuário: ");
								nomedeUsuario = ler.nextLine();
							}
							else
							{
								nomedeUsuario = "Anônimo";
							}
							idApoiado = aleatorio.nextInt();
							
							System.out.println("\n\n..... Aguarde enquanto achamos um apoiador para te ajudar ......\n\n");
							System.out.println("\n__________________________________________________________________________________________________\n");
							System.out.println("\n ..... Em uma outra máquina, alguém está se candidatando para ajudar e digita a opção 1 <3......\n\n");
							
							apoiado.setNomeCompleto(nome);
							apoiado.setIdade(idade_apoiado);
							apoiado.setEmail(email);
							apoiado.setTelefone(telefone);
							apoiado.setCPF(cpf);
							apoiado.setIdApoiado(idApoiado);
							apoiado.setNomedeUsuario(nomedeUsuario);
							
							System.out.println("Digite seu nome: ");
							nome = ler.nextLine();
							System.out.println("Digite seu idade: ");
							idade_apoiador = ler.nextInt();
							System.out.println("Digite seu email: ");
							email = ler.nextLine();
							ler.nextLine();
							System.out.println("Digite seu telefone: ");
							telefone = ler.nextLine();
							System.out.println("Digite seu cpf: ");
							cpf = ler.nextLine();
							idApoiador = aleatorio.nextInt();
																			
							apoiador.setNomeCompleto(nome);
							apoiador.setIdade(idade_apoiador);
							apoiador.setEmail(email);
							apoiador.setTelefone(telefone);
							apoiador.setCPF(cpf);
							apoiador.setIDapoiador(idApoiador);
	
						}


				
				

				
				while(true) {
						//mensagem apoiado
						if (cont == 0)
						{	
							System.out.println("O apoiado manda mensagem requerindo ajuda...");
						}
						else
						{
							System.out.println("O apoiado recebe a resposta...");
							for (String key : disct_mensagem_apoiado.keySet()) 
								{
									String value = disct_mensagem_apoiado.get(key);
							        System.out.println("Suas mensagens - " + value);
								}   
	
							for (String i : disct_mensagem_apoiado.keySet()) 
								{
									String valor = disct_mensagem_apoiador.get(i);
									if (valor != null) {
										System.out.println(apoiador.getNomeCompleto() + " - " + valor);		
									}
								}   
						}
	
					
						System.out.println("\n"+apoiado.getNomedeUsuario()+" - online ");
						System.out.println("\n_____________________________________\n");
						System.out.println("");
						mensagem_apoiado = ler.nextLine();
						disct_mensagem_apoiado.put(Integer.toString(cont), new String(mensagem_apoiado));
						
						System.out.println("\n_____________________________________\n");
						
						System.out.println("O apoiador recebe mensagem...");
						
						
						for (String key : disct_mensagem_apoiado.keySet()) 
							{
								String value = disct_mensagem_apoiado.get(key);
						        System.out.println(apoiado.getNomedeUsuario() + " - " + value);
							} 
						
						for (String x : disct_mensagem_apoiado.keySet())
							{
								String valor = disct_mensagem_apoiador.get(x);
								if (valor != null) {
									System.out.println("Suas mensagens - " + valor);		
								}					
							}
						
						
						System.out.println("\n"+apoiador.getNomeCompleto()+" - online ");
						System.out.println("_____________________________________");
						System.out.println("");
						mensagem_apoiado = ler.nextLine();
						disct_mensagem_apoiador.put(Integer.toString(cont), new String(mensagem_apoiado));
						System.out.println("_____________________________________\n");
						
						
						cont++;
						
						if(cont%3==0) 
						{
							System.out.println("Sua necessidade foi atendida? Digite S(sim) ou N(não) para continuar");
							escolhaUsuario = ler.nextLine().charAt(0);
							if (escolhaUsuario == 'S' || escolhaUsuario == 's')
							{
								break;
							}
						}
					}
				break;
		}

	}	
}
