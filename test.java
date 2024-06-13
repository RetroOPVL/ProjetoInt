package becrauvis;

import java.util.Scanner;
public class test {
	
	static int CPFverif(long CPF)
    {
        long dig1, dig2, dig3, dig4, dig5, dig6, dig7, dig8, dig9, dig10=0, dig11=0, soma1, digverif1 = 1, soma2, digverif2=1;
        int valid;
      
      if(CPF == 11111111111L || CPF == 22222222222L || CPF == 33333333333L)
      {
         valid = 0;
         return valid;
      }
      else if(CPF == 44444444444L || CPF == 55555555555L || CPF == 66666666666L)
      {
          valid = 0;
          return valid;
      }
      else if(CPF == 77777777777L || CPF == 88888888888L || CPF >= 99999999999L)
      {
          valid = 0;
          return valid;
      }
      
      else
      {
      dig11 = CPF%10;
      dig10 = (CPF/10) % 10;
      dig9 = (CPF/100) % 10;
      dig8 = (CPF/1000) % 10;
      dig7 = (CPF/10000) % 10;
      dig6 = (CPF/100000) % 10;
      dig5 = (CPF/1000000) % 10;
      dig4 = (CPF/10000000) % 10;
      dig3 = (CPF/100000000) % 10;
      dig2 = (CPF/1000000000) % 10;
      dig1 = (CPF/10000000000L) % 10;
      
      soma1 = dig1*10 + dig2*9 + dig3*8 + dig4*7 + dig5*6 + dig6*5 + dig7*4 + dig8*3 + dig9*2;
      
      digverif1 = 11 - (soma1%11);
      
      if(digverif1>=10)
      {
          digverif1 = 0;
      }
      
      soma2 = dig1*11 + dig2*10 + dig3*9 + dig4*8 + dig5*7 + dig6*6 + dig7*5 + dig8*4 + dig9*3 + digverif1*2;
      
      digverif2 = 11 - (soma2%11);
      
      if(digverif2>=10)
      {
          digverif2 = 0;
      }
      
   }
      if(digverif1 != dig10 || digverif2 != dig11)
      {
         valid = 0;
      }
      else
      {
         valid = 1;
      } 
      return valid;
  }
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		long CPF, compras[][] = new long[100][6];
		int opcao = 5,c = 0, assentos[][] = new int [9][255], lugarA[][] = new int[5][5], lugarB[][] = new int[10][10], lugarC[][] = new int[10][5], lugarF[][] = new int[6][5], lugarBN[][] = new int[5][10];
		
		while (opcao != 4) {
		System.out.println("+---------------------------+");
		System.out.println("|            MENU           |");
		System.out.println("+---------------------------+");
		System.out.println("| 1-Compra de ingresso      |");
		System.out.println("|                           |");
		System.out.println("| 2-Impressao de ingresso   |");
		System.out.println("|                           |");
		System.out.println("| 3-Estatisticas de venda   |");
		System.out.println("|                           |");
		System.out.println("| 4-Sair                    |");
		System.out.println("+---------------------------+");
		System.out.println("Informe o servico desejado digitando 1, 2 ou 3 e, caso queira fazer logout, digite 4:");
		opcao = ler.nextInt();
		while (opcao != 4 && opcao != 3 && opcao != 2 && opcao != 1) {
		System.out.println("Opcao invalida, por favor digite uma das opcoes fornecidas");
		opcao = ler.nextInt();
		}
		switch (opcao) {
		case (1): {
		int poltrona, Camarote, confirm, frisa, peça, sessão,j=9;
		System.out.println("+---------------------------+");
		System.out.println("|           PEÇAS           |");
		System.out.println("+---------------------------+");
		System.out.println("| 1-Hamlet                  |");
		System.out.println("|                           |");
		System.out.println("| 2-Romeu e Julieta         |");
		System.out.println("|                           |");
		System.out.println("| 3-Auto da Compadecida     |");
		System.out.println("+---------------------------+");

		System.out.println("Informe qual peça deseja, digitando 1, 2 ou 3:");
		peça = ler.nextInt();
		while (peça != 3 && peça != 2 && peça != 1) {
		System.out.println("Opcao invalida, por favor digite uma das opcoes fornecidas");
		peça = ler.nextInt();
		}
		System.out.println("Informe qual sessão deseja, digitando 1 para manhã, 2 para tarde e 3 para noite:");
		sessão = ler.nextInt();
		while (sessão != 3 && sessão != 2 && sessão != 1) {
		System.out.println("Opcao invalida, por favor digite uma das opcoes fornecidas");
		sessão = ler.nextInt();
		}
		if(peça == 1 && sessão == 1)
		{
		    j=0;
		}
		else if(peça == 2 && sessão == 1)
		{
		    j=1;
		}
		else if(peça == 3 && sessão == 1)
		{
		    j=2;
		}
		else if(peça == 1 && sessão == 2)
		{
		    j=3;
		}
		else if(peça == 2 && sessão == 2)
		{
		    j=4;
		}
		else if(peça == 3 && sessão == 2)
		{
		    j=5;
		}
		else if(peça == 1 && sessão == 3)
		{
		    j=6;
		}
		else if(peça == 2 && sessão == 3)
		{
		    j=7;
		}
		else if(peça == 3 && sessão == 3)
		{
		    j=8;
		}

		System.out.println("Informe qual a area desejada: ");
		System.out.println("(1) para Palco A a partir de R$40,00");
		System.out.println("(2) para Palco B a partir de R$60,00");
		System.out.println("(3) para Camarote a partir de R$80,00");
		System.out.println("(4) para Frisa a partir de R$120,00");
		System.out.println("(5) para Balcão Nobre a partir de R$250,00");
		poltrona = ler.nextInt();
		while (poltrona > 5 || poltrona < 1) {
		System.out.println("Opção invalida, tente novamente:");
		poltrona = ler.nextInt();
		}
		switch (poltrona) {
		case (1): {
		int i=0;
		System.out.println("Essas são as poltronas da áreas(as indisponíveis estão marcadas com -----)");
		for (int lin = 0; lin < 5; lin++) {
		for (int col = 0; col < 5; col++) {
		    lugarA[lin][col] = assentos[j][i];
		    i++;
		if (lugarA[lin][col] == 1) {
		System.out.print("----- ");
		} else {
		lugarA[lin][col] = 0;
		System.out.print("A(" + lin + "" + col + ") ");
		}
		}
		System.out.println();
		}
		int X, Y;
		System.out.println("Escolha a fileira, representada pelo primeiro digito dentro dos parenteses:");
		X = ler.nextInt();
		while (X<0 || X>4)
		{
		    System.out.println("Opção inválida, informe outra:");
		    X = ler.nextInt();
		}    
		System.out.println("Escolha a posição na fileira, representada pelo segundo digito dentro do parenteses:");
		Y = ler.nextInt();
		while (Y<0 || Y>4)
		{
		    System.out.println("Opção inválida, informe outra:");
		    Y = ler.nextInt();
		}
		while(lugarA[X][Y] == 1)
		{
		    System.out.println("Lugar indisponível, por favor selecione uma poltrona disponível");
		    System.out.println("Escolha a fileira, representada pelo primeiro digito dentro dos parenteses:");
		X = ler.nextInt();
		while (X<0 || X>4)
		{
		    System.out.println("Opção inválida, informe outra:");
		    X = ler.nextInt();
		}    
		System.out.println("Escolha a posição na fileira, representada pelo segundo digito dentro do parenteses:");
		Y = ler.nextInt();
		while (Y<0 || Y>4)
		{
		    System.out.println("Opção inválida, informe outra:");
		    Y = ler.nextInt();
		}
		}
                System.out.println("Por favor, confirme sua compra da poltrona A(" + X + Y + "), digitando 1 para sim e 2 para não:");
		confirm = ler.nextInt();
                while(confirm != 1 && confirm !=2)
		{
		    System.out.println("Opção inválida, informe uma das opções fornecidas:");
		    confirm = ler.nextInt();
		}
		if(confirm == 1)
		{
		    System.out.println("Informe seu CPF:");
			CPF = ler.nextLong();
			while (CPFverif(CPF) == 0) {
			System.out.println("CPF invalido, insira outro:");
			CPF = ler.nextLong();
			}
		    System.out.println("Compra realizada com sucesso");
		lugarA[X][Y] = 1;
		i=0;
		System.out.println("Essa é a lista de poltronas atualizadas apos sua escolha");
		for (int lin = 0; lin < 5; lin++) {
		for (int col = 0; col < 5; col++) {
		if (lugarA[lin][col] == 1) {
		System.out.print("----- ");
		} else {
		lugarA[lin][col] = 0;
		System.out.print("A(" + lin + "" + col + ") ");
		}
		assentos[j][i] = lugarA[lin][col];
		i++;
		}
		System.out.println();
		}
                compras[c][0] = CPF;
                compras[c][1] = peça;
                compras[c][2] = sessão;
                compras[c][3] = poltrona;
                compras[c][4] = X*10 + Y;
                compras[c][5] = 40;
                c++;
                }
                else
		{
		   System.out.println("Compra cancelada, retornando ao menu");
                }
		break;
		}
		case (2): {
		int i=25;
		System.out.println("Essas são as poltronas da áreas(as indisponíveis estão marcadas com -----)");
		for (int lin = 0; lin < 10; lin++) {
		for (int col = 0; col < 10; col++) {
		lugarB[lin][col] = assentos[j][i];
		i++;
		if (lugarB[lin][col] == 1) {
		System.out.print("----- ");
		} else {
		lugarB[lin][col] = 0;
		System.out.print("B(" + lin + "" + col + ") ");
		}
		}
		System.out.println();
		}
		int X, Y;
		System.out.println("Escolha a fileira, representada pelo primeiro digito da poltrona:");
		X = ler.nextInt();
		while (X<0 || X>9)
		{
		    System.out.println("Opção inválida, informe outra:");
		    X = ler.nextInt();
		}
		System.out.println("Escolha a posição na fileira, representada pelo segundo digito da poltrona:");
		Y = ler.nextInt();
		while (Y<0 || Y>9)
		{
		    System.out.println("Opção inválida, informe outra:");
		    Y = ler.nextInt();
		}
		while(lugarB[X][Y] == 1)
		{
		    System.out.println("Lugar indisponível, por favor selecione uma poltrona disponível");
		    System.out.println("Escolha a fileira, representada pelo primeiro digito dentro dos parenteses:");
		X = ler.nextInt();
		while (X<0 || X>9)
		{
		    System.out.println("Opção inválida, informe outra:");
		    X = ler.nextInt();
		}    
		System.out.println("Escolha a posição na fileira, representada pelo segundo digito dentro do parenteses:");
		Y = ler.nextInt();
		while (Y<0 || Y>9)
		{
		    System.out.println("Opção inválida, informe outra:");
		    Y = ler.nextInt();
		}
		}
                System.out.println("Por favor, confirme sua compra da poltrona B(" + X + Y + "), digitando 1 para sim e 2 para não:");
		confirm = ler.nextInt();
                while(confirm != 1 && confirm !=2)
		{
		    System.out.println("Opção inválida, informe uma das opções fornecidas:");
		    confirm = ler.nextInt();
		}
		if(confirm == 1)
		{
		    System.out.println("Informe seu CPF:");
			CPF = ler.nextLong();
			while (CPFverif(CPF) == 0) {
			System.out.println("CPF invalido, insira outro:");
			CPF = ler.nextLong();
			}
		    System.out.println("Compra realizada com sucesso");
		lugarB[X][Y] = 1;
		i=25;
		System.out.println("Essa é a lista de poltronas atualizadas apos sua escolha");
		for (int lin = 0; lin < 10; lin++) {
		for (int col = 0; col < 10; col++) {
		if (lugarB[lin][col] == 1) {
		System.out.print("----- ");
		} else {
		lugarB[lin][col] = 0;
		System.out.print("B(" + lin + "" + col + ") ");
		}
		assentos[j][i] = lugarB[lin][col];
		i++;
		}
		System.out.println();
		}
                compras[c][0] = CPF;
                compras[c][1] = peça;
                compras[c][2] = sessão;
                compras[c][3] = poltrona;
                compras[c][4] = X*10 + Y;
                compras[c][5] = 60;
                c++;
                }
                else
		{
		   System.out.println("Compra cancelada, retornando ao menu");
                }
		break;
		}
		case (3): {
		int divcamarote=0, q=1, i=124;
		System.out.println("Essas são as poltronas da áreas(as indisponíveis estão marcadas com -----)");
		for (int lin = 0; lin < 10; lin++) {
		for (int col = 0; col < 5; col++) {
		lugarC[lin][col] = assentos[j][i];
		i++;
		if (lugarC[lin][col] == 1) {
		System.out.print("----- ");
		} else {
		lugarC[lin][col] = 0;
		System.out.print("C(" + lin + "" + col + ") ");
		}
		}
		System.out.println();
		divcamarote++;
		if(divcamarote%2==0){
		System.out.println("          Camarote " + q + "          ");
		q++;
		System.out.println();
		}
		}
		int X, Y;
		System.out.println("Escolha a fileira, representada pelo primeiro digito da poltrona:");
		X = ler.nextInt();
		while (X<0 || X>10)
		{
		    System.out.println("Opção inválida, informe outra:");
		    X = ler.nextInt();
		}
		System.out.println("Escolha a posição na fileira, representada pelo segundo digito da poltrona:");
		Y = ler.nextInt();
		while (Y<0 || Y>4)
		{
		    System.out.println("Opção inválida, informe outra:");
		    Y = ler.nextInt();
		}
		while(lugarC[X][Y] == 1)
		{
		    System.out.println("Lugar indisponível, por favor selecione uma poltrona disponível");
		    System.out.println("Escolha a fileira, representada pelo primeiro digito dentro dos parenteses:");
		X = ler.nextInt();
		while (X<0 || X>10)
		{
		    System.out.println("Opção inválida, informe outra:");
		    X = ler.nextInt();
		}    
		System.out.println("Escolha a posição na fileira, representada pelo segundo digito dentro do parenteses:");
		Y = ler.nextInt();
		while (Y<0 || Y>4)
		{
		    System.out.println("Opção inválida, informe outra:");
		    Y = ler.nextInt();
		}
		}
                System.out.println("Por favor, confirme sua compra da poltrona C(" + X + Y + "), digitando 1 para sim e 2 para não:");
		confirm = ler.nextInt();
                while(confirm != 1 && confirm !=2)
		{
		    System.out.println("Opção inválida, informe uma das opções fornecidas:");
		    confirm = ler.nextInt();
		}
		if(confirm == 1)
		{
		    System.out.println("Informe seu CPF:");
			CPF = ler.nextLong();
			while (CPFverif(CPF) == 0) {
			System.out.println("CPF invalido, insira outro:");
			CPF = ler.nextLong();
			}
		    System.out.println("Compra realizada com sucesso");
		lugarC[X][Y] = 1;
		i = 124;    
		System.out.println("Essa é a lista de poltronas atualizadas apos sua escolha");
		divcamarote=0;
		q=1;
		for (int lin = 0; lin < 10; lin++) {
		for (int col = 0; col < 5; col++) {
		if (lugarC[lin][col] == 1) {
		System.out.print("----- ");
		} else {
		lugarC[lin][col] = 0;
		System.out.print("C(" + lin + "" + col + ") ");
		}
		assentos[j][i] = lugarC[lin][col];
		i++;
		}
		System.out.println();
		divcamarote++;
		if(divcamarote%2==0){
		System.out.println("          Camarote " + q + "          ");
		q++;
		System.out.println();
		}
		}
                compras[c][0] = CPF;
                compras[c][1] = peça;
                compras[c][2] = sessão;
                compras[c][3] = poltrona;
                compras[c][4] = X*10 + Y;
                compras[c][5] = 80;
                c++;
                }
                else
		{
		   System.out.println("Compra cancelada, retornando ao menu");
                }
		break;
		}
		case (4): {
		int q=1, i=175;
		System.out.println("Essas são as poltronas da áreas(as indisponíveis estão marcadas com -----)");
		for (int lin = 0; lin < 6; lin++) {
		for (int col = 0; col < 5; col++) {
		lugarC[lin][col] = assentos[j][i];
		i++;
		if (lugarF[lin][col] == 1) {
		System.out.print("----- ");
		} else {
		lugarF[lin][col] = 0;
		System.out.print("F(" + lin + "" + col + ") ");
		}
		}
		System.out.println();
		System.out.println("          Frisa " + q + "          ");
		q++;
		System.out.println();
		}
		int X, Y;
		System.out.println("Escolha a fileira, representada pelo primeiro digito dentro do parenteses:");
		X = ler.nextInt();
		while (X<0 || X>6)
		{
		    System.out.println("Opção inválida, informe outra:");
		    X = ler.nextInt();
		}
		System.out.println("Escolha a posição na fileira, representada pelo segundo digito da poltrona:");
		Y = ler.nextInt();
		while (Y<0 || Y>4)
		{
		    System.out.println("Opção inválida, informe outra:");
		    Y = ler.nextInt();
		}
		while(lugarF[X][Y] == 1)
		{
		    System.out.println("Lugar indisponível, por favor selecione uma poltrona disponível");
		    System.out.println("Escolha a fileira, representada pelo primeiro digito dentro dos parenteses:");
		X = ler.nextInt();
		while (X<0 || X>6)
		{
		    System.out.println("Opção inválida, informe outra:");
		    X = ler.nextInt();
		}    
		System.out.println("Escolha a posição na fileira, representada pelo segundo digito dentro do parenteses:");
		Y = ler.nextInt();
		while (Y<0 || Y>4)
		{
		    System.out.println("Opção inválida, informe outra:");
		    Y = ler.nextInt();
		}
		}
                System.out.println("Por favor, confirme sua compra da poltrona F(" + X + Y + "), digitando 1 para sim e 2 para não:");
		confirm = ler.nextInt();
                while(confirm != 1 && confirm !=2)
		{
		    System.out.println("Opção inválida, informe uma das opções fornecidas:");
		    confirm = ler.nextInt();
		}
		if(confirm == 1)
		{
                    System.out.println("Informe seu CPF:");
			CPF = ler.nextLong();
			while (CPFverif(CPF) == 0) {
			System.out.println("CPF invalido, insira outro:");
			CPF = ler.nextLong();
			}
		    System.out.println("Compra realizada com sucesso");
		q=1;
		i=175;
		System.out.println("Essa é a lista de poltronas atualizadas apos sua escolha");
		for (int lin = 0; lin < 6; lin++) {
		for (int col = 0; col < 5; col++) {
		if (lugarF[lin][col] == 1) {
		System.out.print("----- ");
		} else {
		lugarF[lin][col] = 0;
		System.out.print("C(" + lin + "" + col + ") ");
		}
		assentos[j][i] = lugarC[lin][col];
		i++;
		}
		System.out.println();
		System.out.println("          Frisa " + q + "          ");
		q++;
		System.out.println();
		}
                compras[c][0] = CPF;
                compras[c][1] = peça;
                compras[c][2] = sessão;
                compras[c][3] = poltrona;
                compras[c][4] = X*10 + Y;
                compras[c][5] = 120;
                c++;
                }
                else
		{
		   System.out.println("Compra cancelada, retornando ao menu");
                }
		break;
		}
		case (5): {
		int i=205;
		System.out.println("Essas são as poltronas da áreas(as indisponíveis estão marcadas com -----)");
		for (int lin = 0; lin < 5; lin++) {
		for (int col = 0; col < 10; col++) {
		lugarBN[lin][col] = assentos[j][i];
		i++;
		if (lugarBN[lin][col] == 1) {
		System.out.print("------ ");
		} else {
		lugarBN[lin][col] = 0;
		System.out.print("BN(" + lin + "" + col + ") ");
		}
		}
		System.out.println();
		}
		int X, Y;
		System.out.println("Escolha a fileira, representada pelo primeiro digito da poltrona:");
		X = ler.nextInt();
		while (X<0 || X>4)
		{
		    System.out.println("Opção inválida, informe outra:");
		    X = ler.nextInt();
		}
		System.out.println("Escolha a posição na fileira, representada pelo segundo digito da poltrona:");
		Y = ler.nextInt();
		while (Y<0 || Y>9)
		{
		    System.out.println("Opção inválida, informe outra:");
		    Y = ler.nextInt();
		}
		while(lugarBN[X][Y] == 1)
		{
		    System.out.println("Lugar indisponível, por favor selecione uma poltrona disponível");
		    System.out.println("Escolha a fileira, representada pelo primeiro digito dentro dos parenteses:");
		X = ler.nextInt();
		while (X<0 || X>4)
		{
		    System.out.println("Opção inválida, informe outra:");
		    X = ler.nextInt();
		}    
		System.out.println("Escolha a posição na fileira, representada pelo segundo digito dentro do parenteses:");
		Y = ler.nextInt();
		while (Y<0 || Y>9)
		{
		    System.out.println("Opção inválida, informe outra:");
		    Y = ler.nextInt();
		}
		}
                System.out.println("Por favor, confirme sua compra da poltrona BN(" + X + Y + "), digitando 1 para sim e 2 para não:");
		confirm = ler.nextInt();
                while(confirm != 1 && confirm !=2)
		{
		    System.out.println("Opção inválida, informe uma das opções fornecidas:");
		    confirm = ler.nextInt();
		}
		if(confirm == 1)
		{
		    System.out.println("Informe seu CPF:");
			CPF = ler.nextLong();
			while (CPFverif(CPF) == 0) {
			System.out.println("CPF invalido, insira outro:");
			CPF = ler.nextLong();
			}
		    System.out.println("Compra realizada com sucesso");
		lugarBN[X][Y] = 1;
		i=205;
		System.out.println("Essa é a lista de poltronas atualizadas apos sua escolha");
		for (int lin = 0; lin < 5; lin++) {
		for (int col = 0; col < 10; col++) {
		if (lugarBN[lin][col] == 1) {
		System.out.print("------ ");
		} else {
		lugarBN[lin][col] = 0;
		System.out.print("BN(" + lin + "" + col + ") ");
		}
		assentos[j][i] = lugarBN[lin][col];
		i++;
		}
		System.out.println();
		}
                compras[c][0] = CPF;
                compras[c][1] = peça;
                compras[c][2] = sessão;
                compras[c][3] = poltrona;
                compras[c][4] = X*10 + Y;
                compras[c][5] = 250;
                c++;
                }
                else
		{
		   System.out.println("Compra cancelada, retornando ao menu");
                }
		break;
                }
		}
		break;
		}
		case (2): {
		    
		    System.out.println("Informe seu CPF:");
			CPF = ler.nextLong();
			while (CPFverif(CPF) == 0) {
			System.out.println("CPF invalido, insira outro:");
			CPF = ler.nextLong();
			}
                for (int lin = 0; lin < 100; lin++) {
		for (int col = 0; col < 1; col++) {
                    if(compras[lin][col] == CPF)
                    {
                System.out.println("+---------------------------------------------+");
		System.out.println("|           " + "Ingresso" + "                          |");
		System.out.println("|---------------------------------------------|");
                if(CPF<99999999999L)
                {
                    System.out.println("| " + "CPF: 0" + CPF + "                            |");
                }
                else
                {
		System.out.println("| " + "CPF: " + CPF + "                                         |");
                }
		System.out.println("|---------------------------------------------|");
		if(compras[lin][1] == 1)
		{
		System.out.println("| PEÇA: Hamlet " + "                               |");
		}
		else if(compras[lin][1] == 2)
		{
		System.out.println("| PEÇA: Romeu e Julieta " + "                      |");
		}
		else if(compras[lin][1] == 3)
		{
		System.out.println("| PEÇA: Auto da Compadecida " + "                  |");
		}
		System.out.println("|---------------------------------------------|");
		if(compras[lin][2] == 1)
		{
		System.out.println("| Sessão: Manhã" + "                               |");
		}
		else if(compras[lin][2] == 2)
		{
		System.out.println("| Sessão: Tarde" + "                               |");
		}
		else if(compras[lin][2] == 3)
		{
		System.out.println("| Sessão: Noite" + "                               |");
		}
		System.out.println("|---------------------------------------------|");
		if(compras[lin][3] == 1)
		{
		System.out.println("| Área: Palco A                               |");
		System.out.println("|---------------------------------------------|");
                if(compras[c][4]<10)
                {
                    System.out.println("| Poltrona: A(0" + compras[lin][4] + ")                             |");
                }
                else
                {
		System.out.println("| Poltrona: A(" + compras[lin][4] + ")                             |");
                }
		System.out.println("|---------------------------------------------|");
		System.out.println("| " + "Preço: R$40,00" + "                              |");
		System.out.println("+---------------------------------------------+");
		}
                else if(compras[lin][3] == 2)
		{
		System.out.println("| Área: Palco B                               |");
		System.out.println("|---------------------------------------------|");
		if(compras[c][4]<10)
                {
                    System.out.println("| Poltrona: B(0" + compras[lin][4] + ")                             |");
                }
                else
                {
		System.out.println("| Poltrona: B(" + compras[lin][4] + ")                             |");
                }
		System.out.println("|---------------------------------------------|");
		System.out.println("| Preço: R$60,00" + "                              |");
		System.out.println("+---------------------------------------------+");
		}
                else if(compras[lin][3] == 3)
		{
		System.out.println("| Área: Camarote                              |");
		System.out.println("|---------------------------------------------|");
		if(compras[c][4]<10)
                {
                    System.out.println("| Poltrona: C(0" + compras[lin][4] + ")                             |");
                }
                else
                {
		System.out.println("| Poltrona: C(" + compras[lin][4] + ")                             |");
                }
		System.out.println("|---------------------------------------------|");
		System.out.println("| Preço: R$80,00" + "                              |");
		System.out.println("+---------------------------------------------+");
		}
                else if(compras[lin][3] == 4)
		{
		System.out.println("| Área: Frisa                                 |");
		System.out.println("|---------------------------------------------|");
		if(compras[c][4]<10)
                {
                    System.out.println("| Poltrona: F(0" + compras[lin][4] + ")                             |");
                }
                else
                {
		System.out.println("| Poltrona: F(" + compras[lin][4] + ")                             |");
                }
		System.out.println("|---------------------------------------------|");
		System.out.println("| Preço: R$120,00" + "                             |");
		System.out.println("+---------------------------------------------+");
		}
                else if(compras[lin][3] == 5)
		{
		System.out.println("| Área: Balcão Nobre                          |");
		System.out.println("|---------------------------------------------|");
		if(compras[c][4]<10)
                {
                    System.out.println("| Poltrona: BN(0" + compras[lin][4] + ")                             |");
                }
                else
                {
		System.out.println("| Poltrona: BN(" + compras[lin][4] + ")                             |");
                }
		System.out.println("|---------------------------------------------|");
		System.out.println("| Preço: R$250,00" + "                             |");
		System.out.println("+---------------------------------------------+");
                }
                }
                }    
                } 
		    break;
		}
		case (3): {
                    int peça1=0, peça2=0, peça3=0, resul1, resul2, menos, mais, manha=0, tarde=0, noite=0, resul3, resul4, maior, menor;
                    int resul5, resul6, resul7, resul8, peça1lucro=0, peça2lucro=0, peça3lucro=0, peçaMAISlucro, peçaMENOSlucro, sessão1lucro=0, sessão2lucro=0, sessão3lucro=0, sessãoMAISlucro, sessãoMENOSlucro=0;
                    double lucroM;
                    for(int lin=0;lin<8;lin++)
                    {
                        for(int col=0;col<254;col++)
                        {
                            if(assentos[lin][col] == 1)
                            {
                            if(lin == 0 || lin == 3 || lin == 6)
                            {
                                peça1++;
                                if(col<25)
                                {
                                    peça1lucro = peça1lucro + 40;
                                }
                                if(col<125 && col>=25)
                                {
                                    peça1lucro = peça1lucro + 60;
                                }
                                if(col<175 && col>=125)
                                {
                                    peça1lucro = peça1lucro + 80;
                                }
                                if(col<205 && col>=175)
                                {
                                    peça1lucro = peça1lucro + 120;
                                }
                                if(col<255 && col>=205)
                                {
                                    peça1lucro = peça1lucro + 250;
                                }
                            }
                            else if(lin == 1 || lin == 4 || lin == 7)
                            {
                                peça2++;
                                if(col<25)
                                {
                                    peça2lucro = peça2lucro + 40;
                                }
                                if(col<125 && col>=25)
                                {
                                    peça2lucro = peça2lucro + 60;
                                }
                                if(col<175 && col>=125)
                                {
                                    peça2lucro = peça2lucro + 80;
                                }
                                if(col<205 && col>=175)
                                {
                                    peça2lucro = peça2lucro + 120;
                                }
                                if(col<255 && col>=205)
                                {
                                    peça2lucro = peça2lucro + 250;
                                }
                            }
                            else if(lin == 2 || lin == 5 || lin == 8)
                            {
                                peça3++;
                                if(col<25)
                                {
                                    peça3lucro = peça3lucro + 40;
                                }
                                if(col<125 && col>=25)
                                {
                                    peça3lucro = peça3lucro + 60;
                                }
                                if(col<175 && col>=125)
                                {
                                    peça3lucro = peça3lucro + 80;
                                }
                                if(col<205 && col>=175)
                                {
                                    peça3lucro = peça3lucro + 120;
                                }
                                if(col<255 && col>=205)
                                {
                                    peça3lucro = peça3lucro + 250;
                                }
                            }
                            if(lin == 0 || lin == 1 || lin == 2)
                            {
                                manha++;
                                if(col<25)
                                {
                                    sessão1lucro = sessão1lucro + 40;
                                }
                                if(col<125 && col>=25)
                                {
                                    sessão1lucro = sessão1lucro + 60;
                                }
                                if(col<175 && col>=125)
                                {
                                    sessão1lucro = sessão1lucro + 80;
                                }
                                if(col<205 && col>=175)
                                {
                                    sessão1lucro = sessão1lucro + 120;
                                }
                                if(col<255 && col>=205)
                                {
                                    sessão1lucro = sessão1lucro + 250;
                                }
                            }
                            else if(lin == 3 || lin == 4 || lin == 5)
                            {
                                tarde++;
                                if(col<25)
                                {
                                    sessão2lucro = sessão2lucro + 40;
                                }
                                else if(col<125 && col>=25)
                                {
                                    sessão2lucro = sessão2lucro + 60;
                                }
                                else if(col<175 && col>=125)
                                {
                                    sessão2lucro = sessão2lucro + 80;
                                }
                                else if(col<205 && col>=175)
                                {
                                    sessão2lucro = sessão2lucro + 120;
                                }
                                else if(col<255 && col>=205)
                                {
                                    sessão2lucro = sessão2lucro + 250;
                                }
                            }
                            else if(lin == 6 || lin == 7 || lin == 8)
                            {
                                noite++;
                                if(col<25)
                                {
                                    sessão3lucro = sessão3lucro + 40;
                                }
                                else if(col<125 && col>=25)
                                {
                                    sessão3lucro = sessão3lucro + 60;
                                }
                                else if(col<175 && col>=125)
                                {
                                    sessão3lucro = sessão3lucro + 80;
                                }
                                else if(col<205 && col>=175)
                                {
                                    sessão3lucro = sessão3lucro + 120;
                                }
                                else if(col<255 && col>=205)
                                {
                                    sessão3lucro = sessão3lucro + 250;
                                }
                            }
                          } 
                       }
                    }
                    System.out.println(manha);
                    System.out.println(tarde);
                    System.out.println(noite);
                    System.out.println();
                    
                    resul1 = Math.max(peça1,peça2);
                    mais = Math.max(resul1,peça3);
                    
                    resul2 = Math.min(peça1,peça2);
                    menos = Math.min(resul2,peça3);
                    
                    resul3 = Math.max(manha,tarde);
                    maior = Math.max(resul3,noite);
                    
                    resul4 = Math.min(manha,tarde);
                    menor = Math.min(resul4,noite);
                    
                    resul5 = Math.max(peça1lucro, peça2lucro);
                    peçaMAISlucro = Math.max(resul5,peça3lucro);
                    
                    resul6 = Math.min(peça1lucro, peça2lucro);
                    peçaMENOSlucro = Math.min(resul6,peça3lucro);
                    
                    resul7 = Math.max(sessão1lucro, sessão2lucro);
                    sessãoMAISlucro = Math.max(resul7,sessão3lucro);
                    
                    resul8 = Math.min(sessão1lucro, sessão2lucro);
                    sessãoMENOSlucro = Math.min(resul8,sessão3lucro);
                    
                    if(mais==peça1)
                    {
                      System.out.println("A peça com mais ingressos vendidos é: Hamlet.");  
                    }
                    else if(mais==peça2)
                    {
                      System.out.println("A peça com mais ingressos vendidos é: Romeu e Julieta.");  
                    }
                    else if(mais==peça3)
                    {
                      System.out.println("A peça com mais ingressos vendidos é: Auto da Compadecida.");  
                    }
                    if(menos==peça1)
                    {
                      System.out.println("A peça com menos ingressos vendidos é: Hamlet.");  
                    }
                    else if(menos==peça2)
                    {
                      System.out.println("A peça com menos ingressos vendidos é: Romeu e Julieta.");  
                    }
                    else if(menos==peça3)
                    {
                      System.out.println("A peça com menos ingressos vendidos é: Auto da Compadecida.");  
                    }
                    if(maior==manha)
                    {
                      System.out.println("A sessão que teve maior ocupação de poltronas é a da manhã.");  
                    }
                    else if(maior==tarde)
                    {
                      System.out.println("A sessão que teve maior ocupação de poltronas é a da tarde.");  
                    }
                    else if(maior==noite)
                    {
                      System.out.println("A sessão que teve maior ocupação de poltronas é a da noite.");  
                    }
                    if(menor==manha)
                    {
                      System.out.println("A sessão que teve menor ocupação de poltronas é a da manhã.");  
                    }
                    else if(menor==tarde)
                    {
                      System.out.println("A sessão que teve menor ocupação de poltronas é a da tarde.");  
                    }
                    else if(menor==noite)
                    {
                      System.out.println("A sessão que teve menor ocupação de poltronas é a da noite.");  
                    }
                    if(peçaMAISlucro==peça1lucro)
                    {
                      System.out.println("A peça mais lucrativa foi: Hamlet.");  
                    }
                    else if(peçaMAISlucro==peça2lucro)
                    {
                      System.out.println("A peça mais lucrativa foi: Romeu e Julieta.");  
                    }
                    else if(peçaMAISlucro==peça3lucro)
                    {
                      System.out.println("A peça mais lucrativa foi: Auto da Compadecida.");  
                    }
                    if(peçaMENOSlucro==peça1lucro)
                    {
                      System.out.println("A peça menos lucrativa foi: Hamlet.");  
                    }
                    else if(peçaMENOSlucro==peça2lucro)
                    {
                      System.out.println("A peça menos lucrativa foi: Romeu e Julieta.");  
                    }
                    else if(peçaMENOSlucro==peça3lucro)
                    {
                      System.out.println("A peça menos lucrativa foi: Auto da Compadecida.");  
                    }
                    if(sessãoMAISlucro==sessão1lucro)
                    {
                      System.out.println("A sessão mais lucratica foi a da manhã.");  
                    }
                    else if(sessãoMAISlucro==sessão2lucro)
                    {
                      System.out.println("A sessão mais lucratica foi a da tarde.");  
                    }
                    else if(sessãoMAISlucro==sessão3lucro)
                    {
                      System.out.println("A sessão mais lucratica foi a da noite.");  
                    }
                    if(sessãoMENOSlucro==sessão1lucro)
                    {
                      System.out.println("A sessão menos lucratica foi a da manhã.");  
                    }
                    else if(sessãoMENOSlucro==sessão2lucro)
                    {
                      System.out.println("A sessão menos lucratica foi a da tarde.");  
                    }
                    else if(sessãoMENOSlucro==sessão3lucro)
                    {
                      System.out.println("A sessão menos lucratica foi a da noite.");  
                    }
                    lucroM = (peça1lucro + peça2lucro + peça3lucro)/3;
                    System.out.printf("O lucro médio do teatro com todas as áreas por peça é de: R$%.2f\n", lucroM);
                    
                    
		    break;
		}
		case (4): {
		    System.out.println("Finalizando serviço");
		    break;
		}
		}
		}
		
		
	}
}