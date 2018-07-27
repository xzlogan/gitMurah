package br.com.murah.audixpress.page;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;

import br.com.murah.audixpress.util.ArquivoExcel;

public class Importador {
	ArquivoExcel excell = new ArquivoExcel();
	public String[] empresa = {"empresa","Referenciada","Estrutura","Superior","Categoria","Cargo","Usuario","Codigo","Titulo","INFO","Desc","Criticidade","Biblioteca","Missao","Visao","Valores","Sigla","Index"};
	public String[] area = {"area","Referenciada","Estrutura","Emp Sup","Area Sup","Categoria","Cargo","Usuario","Codigo","Titulo","Sigla","Info","Desc","Criticidade","Biblioteca","Email","Telefone","Rua","Numero","Complemento","Bairro","Cidade","Estado","Cep","Pais","Indx"};
	public String[] processo = {"processo","REFERENCIADA","ESTRUTURA","TIPO SUPERIOR","TITULO_SUPERIOR","TITULO","DESCRICAO","CODIGO","OBJETIVO","CATEGORIA","BIBLIOTECA","INFO","CRITICIDADE","CARGO","USUARIO","Idx"  };
	public String[] ativo = {"ativo","REFERENCIADO","TIPO","ESTRUTURA","TIPO SUPERIO","TITULO SUPERIOR","TITULO","DESCRICAO","CODIGO","CATEGORIA","BIBLIOTECA_REFERENCIADA","INFO_ADICIONAL","CRITICIDADE","CARGO","USUARIO"};
	public String[] risco = {"risco","REFERENCIADO","ABORDAGEM","ENTIDATE_SUPERIOR","TITULO_SUPERIOR","TITULO","CODIGO","DESCRICAO","CATEGORIA","CONTINUIDADE","BIBLIOTECA","ASSERTIVA","AREAS_IMPACTADAS","AMEACA","INFO_ADICIONAL","IMPACTA_FINANCEIRAMENTE","PRIORIZADO","TIPO_RISCO","ORIGEM","POSSIBILIDADE_PERDA","CALCULO_PERDA","FLUXO","FUNDAMENTO","NATUREZA","APETITE","RESPOSTA","DATA_VERSAO"};
	public String[] riscoAvaliacao ={"risco-avaliacao","Abordagem","GUID","TEND IMP","TEND IMP JUS","TEND PRO","TEND PROB JUST","Monitoramento ?","Operações envolvidas?","Probabilidade?","Atos ilegais / fraudes / corrupção ?", "Comprometimento da imagem","Impacto financeiro vs. valor do apetite a riscos","Impacto operacional"};
	public String[] riscoAssociado ={"Controle-associado","ABORDAGEM","RISCO_GUID","CONTROLE_CODIGO","MITIGA_IMP","MITIGA_PROB","PESO_IMP","PESO_PROB","Criterio Controle 1"};
	public String[] controle ={"controle","ABORDAGEM","RISCO SUPERIOR","CONTROLE REFERENCIA","TITULO","CODIGO","DESCRICAO","OBJETIVO","INFO ADICIONAL","DATA UTILIZACAO","STATUS","CATEGORIA","FREQUENCIA","FORMA ATUAÇÂO","FORMA EXECUÇÃO","CARGO","USUARIOS","AMPARADO POLITICA","GAP RESIDUAL","BIBLIOTECA","Idx"};
	public String[] testeControle ={"testeControle","CODIGO_CONTROLE","TITULO","CODIGO_TESTE","DESCRICAO","PROCEDIMENTO","FREQUENCIA","DATA_INICIO","PESO","STATUS","CARGO","USUARIO"};
	public String[] testePassoControle ={"passoTesteControle","CODIGO_TESTE","ORDEM","TITULO","DESCRICAO"};
	public String[] execucaoteste ={"execucaoteste","ABORDAGEM","TESTE_CODIGO","STATUS","DATA_AGENDAMENTO","EXISTE_CONTROLE?","EFICAZ?","RACIONAL","AMOSTRA","COMENTARIOS","DATA_INICIO","DATA_FINAL","REVISOR","CATEGORIA","CARGO","USUARIO","EFETIVACAO","Criterio Teste1"};
	public String[] planilhasExcel =null;
	
	
	
	public int coluna=1;
	public int linha=0;
	public String celula = "";
	public Cell celulaExcel = null;
	public void limpar() throws IOException {
		  
		 for(int i = 0 ; i< 50 ; i++){
			   
			  excell.upCell(0, i , " ");
			  excell.upCell(1, i , " ");
			   
		  }
	 }
	 
	 public void criarDados(int planilha) throws IOException {
		 System.out.println(" ==== iniciando  ===== ");
    	 
		 planilhasExcel =  getPlanilha(planilha);
		 limpar();
			excell.setDadosImportador();	
			int x = planilhasExcel.length;
			excell.setNameSheet(planilhasExcel[0]);
			for(int i = 1 ; i< x ; i++){
			 celulaExcel = excell.getCelulaExcel(linha, coluna,1);
			 excell.upCell(0, i-1 , planilhasExcel[i]);
			 excell.setCelulaExcel(1, i-1 , celulaExcel);
			 coluna ++;
			}
			coluna=1;
		 System.out.println(" ==== Fim  ===== ");
		}
	
	 public String[] getPlanilha(int  planilha) {
		String [] planilhas = null;
		 switch (planilha) {
         case 1:
        	 planilhas = empresa;
        	 linha=  1;
             break;
         case 2:
        	 planilhas = area;
        	 linha=  3;
             break;
         case 3:
        	 planilhas = processo;
        	 linha= 5;
             break;
         case 4:
        	 planilhas = ativo;
        	 linha=  7;
             break;
         case 5:
        	 planilhas = risco;
        	 linha=  9;
             break;
         case 6:
        	 planilhas = riscoAvaliacao;
        	 linha= 11;
             break;
          case 7:
        	  planilhas = riscoAssociado;
        	  linha= 13;
             break;
          case 8:
        	  planilhas = controle;
        	  linha= 15;
             break;
          case 9:
        	  planilhas = testeControle;
        	  linha= 17;
             break;
          case 10:
        	  planilhas = testePassoControle;
        	  linha= 19;
             break;
          case 11:
        	  planilhas = execucaoteste;
        	  linha= 21;
             break;
         default:
        	 planilhas = empresa;
      }
		
		return planilhas;
	}
 
}
