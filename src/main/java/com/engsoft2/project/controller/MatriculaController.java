package com.engsoft2.project.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MatriculaController {
	
	@GetMapping("/aluno/transferencia")
    public String transferPage(Model model) {
		List<String> cities = new ArrayList<String>();
		cities.add("Salvador");
		cities.add("Feira de Santana");
		cities.add("Camaçari");
		
		model.addAttribute("cities", cities);
		
        return "transfer";
    }
	
	@RequestMapping(value = "/aluno/perfil", method = RequestMethod.POST)
    public String storeTransfer(@RequestBody String request, Model model) {

		model.addAttribute("name", "Fulano da Silva");
		model.addAttribute("responsable", "Alguém da Silva");
		model.addAttribute("phone", "(71) 99946-0910");
		model.addAttribute("status", "Transferência em análise");
		model.addAttribute("school", "Colégio Central, SSA - BA");
		model.addAttribute("grade", "1º ano A");
		
		return "profile";
    }
	
	@GetMapping("/aluno/criar/confirmar")	
    public String confirmePage(Model model) {
		model.addAttribute("school", "Escola Suzanna Imabassahay");
		model.addAttribute("city", "Salvador");
		model.addAttribute("neihgborhood", "Barbalho");
		
        return "confirmate";
    }
	
	@RequestMapping(value = "/aluno/confirmar", method = RequestMethod.POST)
    public String storeConfirmate(@RequestBody String request, Model model) {
        
		model.addAttribute("name", "Fulano da Silva");
		model.addAttribute("responsable", "Alguém da Silva");
		model.addAttribute("phone", "(71) 99946-0910");
		model.addAttribute("status", "Matrícula Confirmada");
		model.addAttribute("school", "Colégio Central, SSA - BA");
		model.addAttribute("grade", "1º ano A");
		
		return "profile";
    }
	
	@ResponseBody
	@GetMapping("/getNeighborhoods")
    public List<String> getNeighborhoods(@RequestParam(name="city", required=true) String city) {
		List<String> neighborhoods = new ArrayList<String>();
		
		switch (city) {		
			case "Salvador":
				neighborhoods.add("Barbalho");
				neighborhoods.add("Barra");
				neighborhoods.add("Ondina");
				neighborhoods.add("Pero Vaz");
				neighborhoods.add("Caixa Dagua");
				neighborhoods.add("Pau Miudo");
				neighborhoods.add("Narandiba");
				neighborhoods.add("Sao Caetano");
				neighborhoods.add("LAPINHA");
				neighborhoods.add("CASTELO BRANCO");
				neighborhoods.add("CABULA VI");
				neighborhoods.add("AGUAS CLARAS");
				neighborhoods.add("PIRAJA");
				neighborhoods.add("ALTO DO CABRITO");
				neighborhoods.add("CAJAZEIRAS V");
				neighborhoods.add("CAMPINAS DE PIRAJA");
				neighborhoods.add("LOBATO");
				neighborhoods.add("SAO GONCALO");
				neighborhoods.add("COUTOS");
				neighborhoods.add("CALCADA");
				neighborhoods.add("DOM AVELAR");
				neighborhoods.add("AMARALINA");
				neighborhoods.add("SANTA LUZIA");
				neighborhoods.add("COSME DE FARIAS");
				neighborhoods.add("MATATU");
				neighborhoods.add("JARDIM CAJAZEIRAS");
				neighborhoods.add("SABOEIRO");
				neighborhoods.add("BARRA");
				neighborhoods.add("MUSSURUNGA I");
				neighborhoods.add("TANCREDO NEVES");
				neighborhoods.add("SUSSUARANA");
				neighborhoods.add("NOVA BRASILIA");
				neighborhoods.add("SAO MARCOS");
				neighborhoods.add("FAZENDA GRANDE DO RETIRO");
				neighborhoods.add("IMBUI");
				neighborhoods.add("ARENOSO");
				neighborhoods.add("SANTO ANTONIO");
				neighborhoods.add("CAJAZEIRAS IV");
				neighborhoods.add("SETE DE ABRIL");
				neighborhoods.add("PRAIA GRANDE");
				neighborhoods.add("PARALELA");
				neighborhoods.add("VALERIA");
				neighborhoods.add("CAJAZEIRA");
				neighborhoods.add("VALE DOS LAGOS");
				neighborhoods.add("VASCO DA GAMA");
				neighborhoods.add("CAJAZEIRAS X");
				neighborhoods.add("COSTA AZUL");
				neighborhoods.add("SANTA CRUZ");
				neighborhoods.add("BOCA DO RIO");
				neighborhoods.add("FEDERACAO");
				neighborhoods.add("FAZENDA COUTOS");
				neighborhoods.add("RIO SENA");
				neighborhoods.add("ONDINA");
				neighborhoods.add("NULL");
				neighborhoods.add("CIA");
				neighborhoods.add("SAUDE");
				neighborhoods.add("BOA VISTA DE SAO CAETANO");
				neighborhoods.add("PERI PERI");
				neighborhoods.add("VILA CANARIA");
				neighborhoods.add("MARECHAL RONDON");
				neighborhoods.add("RETIRO");
				neighborhoods.add("JARDIM SANTO INACIO");
				neighborhoods.add("BARREIRAS");
				neighborhoods.add("AGUA DE MENINOS");
				neighborhoods.add("PIATA");
				neighborhoods.add("BAIRRO DA PAZ");
				neighborhoods.add("SAO JOAQUIM");
				neighborhoods.add("BROTAS VASCO DA GAMA");
				neighborhoods.add("CAIXA D AGUA");
				break;
			case "Feira de Santana":
				neighborhoods.add("Lagoa Grande");
				neighborhoods.add("Pedra Ferrada");
				neighborhoods.add("Campo Limpo");
				break;
			case "Camaçari":
				neighborhoods.add("Parque Satélite");
				neighborhoods.add("Ponto Certo");
				neighborhoods.add("Gravatá");
				break;
			default:
				
		}
		
        return neighborhoods;
    }
	
	@ResponseBody
	@GetMapping("/getSchools")
    public List<String> getSchools(@RequestParam(name="neighborhood", required=true) String neighborhood) {
		List<String> schools = new ArrayList<String>();
		
		switch (neighborhood) {		
			case "Barbalho":
				schools.add("Escola Estadual Suzana Imbassahy");
				break;
			case "Barra":
				schools.add("Uma escola");
				schools.add("Outra escola");
				break;
			case "Ondina":
				schools.add("ESCOLA ERWIN MORGENROTH");
				schools.add("COLEGIO ESTADUAL EVARISTO DA VEIGA");
				schools.add("CENTRO DE EDUCACAO ESPECIAL DA BAHIA");
				schools.add("CENTRO DE CAPACITACAO DE PROFISSIONAIS DA EDUCACAO");
				schools.add("CENTRO DE ATENDIMENTO EDUCACIONAL ESPECIALIZADO PESTALOZZI DA BAHIA");
				break;
			case "Pero Vaz":
				schools.add("Centro Educacional Carneiro Ribeiro - Classe I");
				schools.add("Centro Educacional Carneiro Ribeiro - Classe II");
				break;
			case "Caixa Dagua":
				schools.add("Centro Educacional Carneiro Ribeiro - Classe IV");
				schools.add("CENTRO ESTADUAL DE EDUCACAO PROFISSIONAL EM SAUDE ANISIO TEIXEIRA");
				schools.add("COLEGIO ESTADUAL LUIS CABRAL");
				schools.add("ESCOLA ESTADUAL ANISIO TEIXEIRA");
				schools.add("CENTRO EDUCACIONAL CARNEIRO RIBEIRO");
				break;
			case "Pau Miudo":
				schools.add("CENTRO EDUCACIONAL CARNEIRO RIBEIRO - CLASSE III");
				schools.add("COLEGIO ESTADUAL MARQUES DE MARICA");
				schools.add("ESCOLA PROFESSORA CANDOLINA");
				break;
			case "SAO CAETANO":
				schools.add("EE - CENTRO ESTADUAL DE EDUCACAO PROFISSIONAL EM LOGISTICA E TRANSPORTE LUIZ PINTO DE CARVALHO");
				schools.add("EE - COLEGIO ESTADUAL DESEMBARGADOR PEDRO RIBEIRO");
				schools.add("EE - COLEGIO ESTADUAL PROFESSOR EDSON CARNEIRO");
				schools.add("EE - COLEGIO ESTADUAL ASSIS CHATEAUBRIAND");
				schools.add("EE - COLEGIO ESTADUAL PROFESSOR CARLOS ALBERTO CERQUEIRA");
				schools.add("EE - COLEGIO ESTADUAL PROFESSOR JOSE BARRETO DE ARAUJO BASTOS");
				break;
			case "BARBALHO":
				schools.add("EE - ESCOLA ESTADUAL PROFESSORA SUZANA IMBASSAHY");
				schools.add("EE - ESCOLA GETULIO VARGAS");
				schools.add("EE - CENTRO ESTADUAL DE EDUCACAO PROFISSIONAL EM APOIO EDUCACIONAL TECNOLOGIA DA INFORMACAO ISAIAS A");
				break;
			case "GARCIA":
				schools.add("EE - CENTRO EDUCACIONAL EDGAR SANTOS");
				schools.add("EE - ESCOLA HILDETE LOMANTO");
				break;
			case "BOA VIAGEM":
				schools.add("EE - COLEGIO ESTADUAL LUIZ TARQUINIO");
				schools.add("EE - COLEGIO ESTADUAL ABILIO CESAR BORGES");
				schools.add("EE - COLEGIO ESTADUAL CPM LUIZ TARQUINIO");
				break;
			case "BROTAS":
				schools.add("EE - COLEGIO ESTADUAL LUIS VIANA");
				schools.add("EE - COLEGIO ESTADUAL GOES CALMON");
				schools.add("EE - ESCOLA ESTADUAL MANOEL VITORINO");
				schools.add("EE - COLEGIO ESTADUAL DEPUTADO HENRIQUE BRITO");
				schools.add("EE - ESCOLA VISCONDE DE CAIRU");
				schools.add("ESCOLA ESTADUAL LUIZ VIANA");
				break;
			case "BONFIM":
				schools.add("EE - COLEGIO DA POLICIA MILITAR - UNIDADE I CPM DENDEZEIROS");
				schools.add("EE - COLEGIO ESTADUAL ALIPIO FRANCA");
				schools.add("EE - COLEGIO ESTADUAL PAULO AMERICO DE OLIVEIRA");
				break;
			case "LIBERDADE":
				schools.add("EE - COLEGIO ESTADUAL DUQUE DE CAXIAS");
				schools.add("EE - COLEGIO ESTADUAL TEREZA CONCEICAO MENEZES");
				schools.add("EE - COLEGIO ESTADUAL CARNEIRO RIBEIRO FILHO");
				schools.add("EE - COLEGIO ESTADUAL PIERRE VERGER");
				break;
			case "ITAPUA":
				schools.add("EE - COLEGIO ESTADUAL GOVERNADOR LOMANTO JUNIOR");
				schools.add("EE - COLEGIO ESTADUAL ROTARY");
				schools.add("EE - COLEGIO ESTADUAL YEDA BARRADAS CARNEIRO");
				schools.add("EE - ESCOLA MARECHAL MASCARENHAS DE MORAIS");
				schools.add("EE - ESCOLA ESTADUAL ROTARY");
				break;
			case "CABULA":
				schools.add("EE - COLEGIO ESTADUAL GOVERNADOR ROBERTO SANTOS");
				schools.add("EE - COLEGIO POLIVALENTE DO CABULA");
				schools.add("EE - COLEGIO ESTADUAL ADROALDO RIBEIRO COSTA");
				schools.add("EE - ESCOLA VISCONDE DE ITAPARICA");
				schools.add("EE - COLEGIO ESTADUAL LUIS CABRAL");
				break;
			case "RIO VERMELHO":
				schools.add("EE - COLEGIO ESTADUAL MANOEL DEVOTO");
				schools.add("EE - COLEGIO ESTADUAL ALFREDO MAGALHAES");
				schools.add("EE - COLEGIO ESTADUAL EURICLES DE MATOS");
				schools.add("CENTRO EDUCACIONAL PELA ARTE HORA DA CRIANCA");
				break;
			case "RIBEIRA":
				schools.add("EE - COLEGIO ESTADUAL PRESIDENTE COSTA E SILVA");
				schools.add("EE - COLEGIO DA POLICIA MILITAR - CPM JOAO FLORENCIO GOMES");
				schools.add("EE - ESCOLA PRESCILIANO SILVA");
				schools.add("EE - ESCOLA ESTADUAL PROFESSORA MARIA JOSE DE PAULA MOREIRA");
				schools.add("EE - COLEGIO ESTADUAL VITOR SOARES");
				schools.add("EE - ESCOLA ALFREDO AMORIM");
				break;
			case "PERIPERI":
				schools.add("EE - COLEGIO ESTADUAL PRESIDENTE HUMBERTO DE ALENCAR CASTELO BRANCO");
				schools.add("EE - ESCOLA ANTONIO CARLOS MAGALHAES");
				schools.add("EE - COLEGIO ESTADUAL NOSSA SENHORA DE FATIMA");
				schools.add("EE - COLEGIO ESTADUAL PROFESSOR FELIPE BUSQUET ANGLADA");
				break;
			case "NAZARE":
				schools.add("EE - CENTRO ESTADUAL DE EDUCACAO PROFISSIONAL EM GESTAO SEVERINO VIEIRA");
				schools.add("EE - COLEGIO ESTADUAL DA BAHIA CENTRAL");
				schools.add("EE - COLEGIO ESTADUAL MARIO AUGUSTO TEIXEIRA DE FREITAS");
				schools.add("EE - COLEGIO ESTADUAL RUY BARBOSA");
				schools.add("EE - ESCOLA ESTADUAL SEVERINO VIEIRA");
				schools.add("CENTRO DE APOIO PEDAGOGICO AO DEFICIENTE VISUAL");
				schools.add("EE - CENTRO ESTADUAL DE EDUCACAO PROFISSIONAL EM ARTES E DESIGN");
				break;
			case "BARRIS":
				schools.add("EE - COLEGIO ESTADUAL SENHOR DO BONFIM");
				schools.add("EE - CENTRO ESTADUAL DE EDUCACAO MAGALHAES NETO");
				schools.add("NUCLEO EDUCACIONAL GOES CALMON");
				break;
			case "ACUPE DE BROTAS":
				schools.add("EE - COLEGIO ESTADUAL ANTONIO CARLOS MAGALHAES");
				break;
			case "IAPI":
				schools.add("EE - COLEGIO ESTADUAL HELENA CELESTINO MAGALHAES");
				schools.add("EE - COLEGIO ESTADUAL ALVARO AUGUSTO DA SILVA");
				schools.add("EE - ESCOLA ESTADUAL MINISTRO PIRES E ALBUQUERQUE");
				break;
			case "PELOURINHO":
				schools.add("EE - COLEGIO ESTADUAL AZEVEDO FERNANDES");
				schools.add("ESCOLA DE DANCA DA FUNDACAO CULTURAL DO ESTADO DA BAHIA");
				break;
			case "CAJAZEIRAS":
				schools.add("EE - COLEGIO ESTADUAL DONA LEONOR CALMON");
				schools.add("EE - COLEGIO ESTADUAL RAFAEL OLIVEIRA");
				schools.add("EE - COLEGIO ESTADUAL LUIZ FERNANDO MACEDO COSTA");
				schools.add("EE - ESCOLA ESTADUAL LUIZ JOSE DE OLIVEIRA");
				schools.add("EE - COLEGIO ESTADUAL EDUARDO BAHIANA");
				schools.add("EE - COLEGIO ESTADUAL OLIVEIRA BRITO");
				break;
			case "CANELA":
				schools.add("EE - COLEGIO ESTADUAL DEPUTADO MANOEL NOVAES");
				break;
			case "SAO CRISTOVAO":
				schools.add("EE - COLEGIO ESTADUAL HELENA MATHEUS");
				schools.add("EE - COLEGIO ESTADUAL VISCONDE DE MAUA");
				schools.add("EE - COLEGIO ESTADUAL 15 DE NOVEMBRO");
				break;
			case "DOIS DE JULHO":
				schools.add("EE - COLEGIO ESTADUAL YPIRANGA");
				break;
			case "CAMPO GRANDE":
				schools.add("EE - COLEGIO ESTADUAL ODORICO TAVARES");
				break;
			case "ARMACAO":
				schools.add("EE - COLEGIO ESTADUAL PEDRO CALMON");
				break;
			case "STIEP":
				schools.add("EE - COLEGIO ESTADUAL PRESIDENTE EMILIO GARRASTAZU MEDICI");
				schools.add("EE - COLEGIO ESTADUAL EDIVALDO BOAVENTURA");
				break;
			case "PITUBA":
				schools.add("EE - COLEGIO ESTADUAL RAPHAEL SERRAVALLE");
				schools.add("EE - COLEGIO ESTADUAL SATIRO DIAS");
				schools.add("EE - CENTRO EST DE ED PROFISSIONAL EM SAUDE E TECNOLOGIA DA INFORMACAO CARLOS CORREIA DE MENEZES SAN");
				schools.add("EE - COLEGIO ESTADUAL PROFESSOR NOGUEIRA PASSOS");
				break;
			case "CENTRO":
				schools.add("EE - COLEGIO ESTADUAL URSULA CATHARINO");
				schools.add("EE - ESCOLA CELINA PINHO");
				schools.add("EE - ESCOLA DONA JENNY GOMES");
				schools.add("EE - COLEGIO ESTADUAL ANA BERNARDES");
				break;
			case "PARIPE":
				schools.add("EE - COLEGIO ESTADUAL ALMIRANTE BARROSO");
				schools.add("EE - COLEGIO ESTADUAL BARROS BARRETO");
				schools.add("EE - COLEGIO ESTADUAL EDSON TENORIO DE ALBUQUERQUE");
				schools.add("EE - COLEGIO ESTADUAL PROFESSOR CARLOS BARROS");
				schools.add("EE - COLEGIO ESTADUAL PROFESSORA MARIA ODETTE PITHON RAYNAL");
				schools.add("EE - COLEGIO ESTADUAL SETE DE SETEMBRO");
				break;
			case "ITACARANHA":
				schools.add("EE - COLEGIO ESTADUAL CLERISTON ANDRADE");
				break;
			case "VILA LAURA":
				schools.add("EE - COLEGIO ESTADUAL FREDERICO COSTA");
				break;
			case "SAN MARTIN":
				schools.add("EE - COLEGIO ESTADUAL RUBEN DARIO");
				schools.add("EE - COLEGIO ESTADUAL ZILMA GOMES PARENTE DE BARROS");
				schools.add("EE - ESCOLA ESTADUAL PROFESSORA NATALIA VINHAES");
				schools.add("EE - COLEGIO MODELO LUIS EDUARDO MAGALHAES");
				break;
			case "PAU DA LIMA":
				schools.add("EE - ESCOLA ESTADUAL PROFESSORA ARMANDINA MARQUES");
				schools.add("EE - COLEGIO ESTADUAL DANIEL LISBOA");
				schools.add("EE - ESCOLA DE 1? GRAU JESUS CRISTO");
				schools.add("EE - COLEGIO ESTADUAL DAVID MENDES PEREIRA");
				schools.add("EE - COLEGIO ESTADUAL PROFESSORA MARIA DE LOURDES PARADA FRANCH");
				schools.add("EE - COLEGIO ESTADUAL DE PAU DA LIMA");
				break;
			case "SAO TOME DE PARIPE":
				schools.add("EE - COLEGIO ESTADUAL MARCILIO DIAS");
				schools.add("EE - COLEGIO ESTADUAL JOAO CARIBE");
				break;
			case "PLATAFORMA":
				schools.add("EE - COLEGIO ESTADUAL DEMOCRATICO BERTHOLDO CIRILO DOS REIS");
				schools.add("EE - ESCOLA ESTADUAL JOSIAS DE ALMEIDA MELO");
				schools.add("EE - COLEGIO ESTADUAL LUIS ROGERIO DE SOUZA");
				schools.add("EE - COLEGIO ESTADUAL PROFESSOR ARISTIDES DE SOUZA OLIVEIRA");
				schools.add("EE - COLEGIO ESTADUAL DE PLATAFORMA");
				schools.add("CENTRO DE ESPORTES ARTE E CULTURA CESAR BORGES");
				break;
			case "MUSSURUNGA II":
				schools.add("EE - COLEGIO ESTADUAL PROFESSORA LEILA RUBENS FONSECA");
				break;
			case "MATA ESCURA":
				schools.add("EE - ESCOLA ESPECIAL DA PENITENCIARIA LEMOS BRITO");
				schools.add("EE - ESCOLA SANTA EDWIRGENS");
				schools.add("EE - ESCOLA ESTADUAL CELIA MATA PIRES");
				schools.add("EE - COLEGIO ESTADUAL MARCIA MECCIA");
				schools.add("EE - COLEGIO ESTADUAL PROFESSOR DORIVAL PASSOS");
				break;
			case "ENGENHO VELHO DE BROTAS":
				schools.add("EE - COLEGIO ESTADUAL LEDA JESUINO DOS SANTOS");
				schools.add("EE - COLEGIO ESTADUAL CIDADE DE CURITIBA");
				schools.add("EE - ESCOLA MARIA ROMANA CALMON");
				break;
			case "PERNAMBUES":
				schools.add("EE - ESCOLA ESTADUAL PROFESSORA MARIINHA TAVARES");
				schools.add("EE - COLEGIO ESTADUAL KLEBER PACHECO");
				schools.add("EE - COLEGIO ESTADUAL MINISTRO ALIOMAR BALEEIRO");
				break;
			case "CAPELINHA":
				schools.add("EE - ESCOLA ESTADUAL JURACY MAGALHAES JUNIOR");
				break;
			case "BAIXA DE QUINTAS":
				schools.add("EE - ESCOLA LEOPOLDO DOS REIS");
				break;
			case "MASSARANDUBA":
				schools.add("EE - ESCOLA OCRIDALINA MADUREIRA");
				break;
			case "JARDIM NOVA ESPERANCA":
				schools.add("EE - COLEGIO ESTADUAL PADRE JOSE VASCONCELOS");
				break;
			case "NORDESTE":
				schools.add("EE - ESCOLA POLIVALENTE DE AMARALINA");
				schools.add("EE - COLEGIO ESTADUAL PROFESSOR CARLOS SANT ANNA");
				break;
			case "URUGUAI":
				schools.add("EE - COLEGIO ESTADUAL POLIVALENTE SAN DIEGO");
				schools.add("EE - ESCOLA ESTADUAL SOLANGE HORTELIO FRANCO");
				break;
			case "CIDADE NOVA":
				schools.add("EE - COLEGIO ESTADUAL PRINCESA IZABEL");
				break;
			case "LAPINHA":
				schools.add("EE - ESCOLA TECNICA ESTADUAL LUIZ NAVARRO DE BRITO");
				break;
			case "CASTELO BRANCO":
				schools.add("EE - ESCOLA PROFESSOR ROBERTO SANTOS");
				schools.add("EE - COLEGIO ESTADUAL RAYMUNDO DE ALMEIDA GOUVEIA");
				break;
			case "CABULA VI":
				schools.add("EE - COLEGIO ESTADUAL PROFESSORA ELISABETH CHAVES VELOSO");
				schools.add("EE - COLEGIO ESTADUAL HEITOR VILLA LOBOS");
				break;
			case "AGUAS CLARAS":
				schools.add("EE - COLEGIO ESTADUAL RENAN BALEEIRO");
				schools.add("EE - COLEGIO ESTADUAL SANTA RITA DE CASSIA");
				schools.add("EE - ESCOLA CLARITA MARIANI");
				break;
			case "PIRAJA":
				schools.add("EE - ESCOLA TEODORO SAMPAIO");
				schools.add("EE - COLEGIO ESTADUAL ALBERTO SANTOS DUMONT");
				schools.add("EE - COLEGIO ESTADUAL CESARE CASALI");
				break;
			case "ALTO DO CABRITO":
				schools.add("EE - COLEGIO ESTADUAL TEREZA HELENA MATA PIRES");
				break;
			case "CAJAZEIRAS V":
				schools.add("EE - ESCOLA ESTADUAL DEPUTADO NAOMAR ALCANTARA");
				schools.add("EE - COLEGIO ESTADUAL BATISTA NEVES");
				break;
			case "CAMPINAS DE PIRAJA":
				schools.add("EE - COLEGIO ESTADUAL ARTUR DE SALES ");
				break;
			case "LOBATO":
				schools.add("EE - COLEGIO ESTADUAL DOUTOR AILTON PINTO DE ANDRADE");
				schools.add("EE - ESCOLA ESTADUAL IVONE VIEIRA LIMA");
				schools.add("EE - COLEGIO ESTADUAL DALVA MATOS");
				schools.add("EE - COLEGIO ESTADUAL RAYMUNDO MATTA");
				schools.add("EE - COLEGIO DA POLICIA MILITAR - UNIDADE II CPM LOBATO");
				break;
			case "SAO GONCALO":
				schools.add("EE - COLEGIO ESTADUAL ALBERTO VALENCA");
				break;
			case "COUTOS":
				schools.add("EE - COLEGIO ESTADUAL ANFRISIA SANTIAGO");
				schools.add("EE - COLEGIO ESTADUAL ANA CRISTINA PRAZERES MATA PIRES");
				break;
			case "CALCADA":
				schools.add("EE - ESCOLA ESTADUAL CASTRO ALVES");
				schools.add("EE - COLEGIO ESTADUAL LANDULFO ALVES");
				break;
			case "DOM AVELAR":
				schools.add("EE - COLEGIO ESTADUAL CONSELHEIRO VICENTE PACHECO DE OLIVEIRA");
				break;
			case "AMARALINA":
				schools.add("EE - ESCOLA CUPERTINO DE LACERDA");
				break;
			case "SANTA LUZIA":
				schools.add("EE - COLEGIO ESTADUAL DANTAS JUNIOR");
				break;
			case "COSME DE FARIAS":
				schools.add("EE - COLEGIO ESTADUAL DOUTOR JOAO PEDRO DOS SANTOS");
				schools.add("EE - COLEGIO ESTADUAL COSME DE FARIAS");
				break;
			case "MATATU":
				schools.add("EE - COLEGIO ESTADUAL BRIGADEIRO EDUARDO GOMES");
				break;
			case "JARDIM CAJAZEIRAS":
				schools.add("EE - COLEGIO ESTADUAL DEPUTADO ROGERIO REGO");
				break;
			case "SABOEIRO":
				schools.add("EE - COLEGIO ESTADUAL GOVERNADOR OTAVIO MANGABEIRA");
				break;
			case "BARRA":
				schools.add("EE - COLEGIO ESTADUAL JOAO DAS BOTAS");
				break;
			case "MUSSURUNGA I":
				schools.add("EE - COLEGIO ESTADUAL PADRE PALMEIRA");
				schools.add("EE - COLEGIO ESTADUAL PINTO DE AGUIAR");
				schools.add("EE - ESCOLA ESTADUAL RAUL SA");
				schools.add("EE - CENTRO ESTADUAL DE EDUCACAO PROFISSIONAL EM CONTROLE E PROCESSOS INDUSTRIAIS NEWTON SUCUPIRA");
				break;
			case "TANCREDO NEVES":
				schools.add("EE - COLEGIO ESTADUAL EDVALDO FERNANDES");
				schools.add("EE - COLEGIO ESTADUAL HELENA MAGALHAES");
				schools.add("EE - COLEGIO ESTADUAL ZUMBI DOS PALMARES");
				schools.add("EE - ESCOLA ESTADUAL PROFESSOR IGNACIO LUNELLI");
				break;
			case "SUSSUARANA":
				schools.add("EE - ESCOLA PROFESSORA CANDOLINA");
				schools.add("EE - COLEGIO ESTADUAL SAO DANIEL COMBONI");
				schools.add("CE - COLEGIO ESTADUAL NOVA DE SUSSUARANA");
				break;
			case "NOVA BRASILIA":
				schools.add("EE - COLEGIO ESTADUAL VERA LUX");
				break;
			case "SAO MARCOS":
				schools.add("EE - COLEGIO ESTADUAL DE APLICACAO ANISIO TEIXEIRA");
				schools.add("EE - COLEGIO ESTADUAL MARIA AMELIA SANTOS");
				break;
			case "FAZENDA GRANDE DO RETIRO":
				schools.add("EE - COLEGIO ESTADUAL BENTO GONCALVES");
				schools.add("EE - ESCOLA DOM AVELAR BRANDAO VILELA");
				schools.add("EE - COLEGIO ESTADUAL DOIS DE JULHO");
				break;
			case "IMBUI":
				schools.add("EE - COLEGIO ESTADUAL PROFESSOR ROMULO ALMEIDA");
				schools.add("EE - COLEGIO ESTADUAL MONSENHOR MANOEL BARBOSA");
				schools.add("EE - COLEGIO ESTADUAL PROFESSORA ANGELITA MORENO");
				break;
			case "ARENOSO":
				schools.add("EE - COLEGIO ESTADUAL DEPUTADO LUIS EDUARDO MAGALHAES");
				schools.add("EE - COLEGIO ESTADUAL ANTONIO SERGIO CARNEIRO");
				break;
			case "SANTO ANTONIO":
				schools.add("ESCOLA DIVINO MESTRE");
				break;
			case "CAJAZEIRAS IV":
				schools.add("EE - COLEGIO ESTADUAL EDVALDO BRANDAO CORREIA");
				break;
			case "SETE DE ABRIL":
				schools.add("EE - COLEGIO ESTADUAL ERALDO TINOCO");
				break;
			case "PRAIA GRANDE":
				schools.add("EE - COLEGIO ESTADUAL PROFESSORA MARIA ANITA");
				schools.add("EE - ESCOLA ESTADUAL LINDENBERGUE CARDOSO");
				break;
			case "PARALELA":
				schools.add("EE - COLEGIO ESTADUAL BOLIVAR SANTANA");
				break;
			case "VALERIA":
				schools.add("EE - COLEGIO ESTADUAL DINAH GONCALVES");
				schools.add("EE - ESCOLA ESTADUAL NOSSA SENHORA DE FATIMA");
				schools.add("EE - COLEGIO ESTADUAL PROFESSORA NOEMIA REGO");
				break;
			case "CAJAZEIRA":
				schools.add("EE - COLEGIO ESTADUAL PROFESSOR NELSON BARROS");
				break;
			case "VALE DOS LAGOS":
				schools.add("EE - COLEGIO ESTADUAL VALE DOS LAGOS");
				break;
			case "VASCO DA GAMA":
				schools.add("EE - COLEGIO ESTADUAL VICTOR CIVITA");
				break;
			case "CAJAZEIRAS X":
				schools.add("EE - COLEGIO ESTADUAL DONA MORA GUIMARAES");
				break;
			case "COSTA AZUL":
				schools.add("EE - COLEGIO ESTADUAL JOSE TOBIAS NETO");
				schools.add("EE - COLEGIO ESTADUAL THALES DE AZEVEDO");
				break;
			case "SANTA CRUZ":
				schools.add("EE - ESCOLA ESTADUAL GENERAL DIONISIO CERQUEIRA");
				break;
			case "BOCA DO RIO":
				schools.add("EE - COLEGIO ESTADUAL PROFESSORA GEORGINA RAMOS DA SILVA");
				break;
			case "FEDERACAO":
				schools.add("EE - COLEGIO ESTADUAL HENRIQUETA MARTINS CATHARINO");
				schools.add("EE - COLEGIO ESTADUAL MARIO COSTA NETO");
				break;
			case "FAZENDA COUTOS":
				schools.add("EE - COLEGIO ESTADUAL MONTEIRO LOBATO");
				break;
			case "RIO SENA":
				schools.add("EE - COLEGIO ESTADUAL SARA VIOLETA DE MELLO KERTESZ");
				break;
			case "ONDINA":
				schools.add("EE - CENTRO DE CAPACITACAO DE PROFISSIONAIS DA EDUCACAO");
				break;
			case "NULL":
				schools.add("EE - ESCOLA ESTADUAL LEA LEAL");
				break;
			case "CIA":
				schools.add("EE - COLEGIO ESTADUAL JOSE AUGUSTO TOURINHO DANTAS");
				break;
			case "SAUDE":
				schools.add("CENTRO DE APOIO PEDAGAGOGICO AO DEFICIENTE VISUAL");
				break;
			case "BOA VISTA DE SAO CAETANO":
				schools.add("EE - ESCOLA ESTADUAL PROFESSOR LUIS DE MOURA BASTOS");
				break;
			case "PERI PERI":
				schools.add("EE - COLEGIO ESTADUAL DE PRAIA GRANDE");
				break;
			case "VILA CANARIA":
				schools.add("EE - ESCOLA ESTADUAL FILADELFIA");
				break;
			case "MARECHAL RONDON":
				schools.add("EE - ESCOLA ESTADUAL PROFESSOR GERMANO MACHADO NETO");
				break;
			case "RETIRO":
				schools.add("EE - ESCOLA ESTADUAL 15 DE OUTUBRO");
				break;
			case "JARDIM SANTO INACIO":
				schools.add("EE - COLEGIO ESTADUAL 29 DE MARCO");
				break;
			case "BARREIRAS":
				schools.add("EE - COLEGIO ESTADUAL PROFESSORA MARIA BERNADETE BRANDAO");
				break;
			case "AGUA DE MENINOS":
				schools.add("EE - COLEGIO ESTADUAL HAMILTON DE JESUS LOPES");
				schools.add("EE - CENTRO ESTADUAL DE EDUCACAO PROFISSIONAL DA BAHIA");
				break;
			case "PIATA":
				schools.add("EE - COLEGIO ESTADUAL SATELITE");
				break;
			case "BAIRRO DA PAZ":
				schools.add("EE - COLEGIO ESTADUAL MESTRE PAULO DOS ANJOS");
				break;
			case "SAO JOAQUIM":
				schools.add("CENTROS INTERDISCIPLINARES - CENINT");
				break;
			case "BROTAS VASCO DA GAMA":
				schools.add("ESCOLA DE FORMACAO TECNICA EM SAUDE PROFESSOR JORGE NOVIS");
				break;
			case "CAIXA D AGUA":
				schools.add("CENTRO EDUCACIONAL CARNEIRO RIBEIRO - ESCOLA PARQUE");
				break;
			default:
				schools.add("Uma escola");
				schools.add("Outra escola");
		}
		
        return schools;
    }
}
