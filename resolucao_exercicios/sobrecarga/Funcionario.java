package resolucaoExercicios.sobrecarga;

import java.time.LocalDate;

public class Funcionario {

	private String cpf;
	private int mesAdmisao;
	private int anoAdmisao;

	public Funcionario(String cpf, int mesAdmisao, int anoAdmisao) {
		this.cpf = cpf;
		this.mesAdmisao = mesAdmisao;
		this.anoAdmisao = anoAdmisao;
	}

	private int calculaIdadeAdmisao() {
		int mesAtual = LocalDate.now().getMonthValue();
		int anoAtual = LocalDate.now().getYear();
		if (this.mesAdmisao <= mesAtual) {
			return anoAtual - this.anoAdmisao;
		} else {
			return anoAtual - this.anoAdmisao - 1;
		}
	}
	
	public void calculaPL(String nivelEmpresarial) {
		this.mostraPL(nivelEmpresarial);
	}
	
	public void calculaPL() {
		String nivelEmpresarial  = this.geraNivelEmpresarial();
		this.mostraPL(nivelEmpresarial);
	}

	private void mostraPL(String nivelEmpresarial) {
		switch (nivelEmpresarial) {
		case "ABC":
			System.out.println("Voce vai receber 5x seu salario");
			break;
		case "DEF":
			System.out.println("Voce vai receber 3x seu salario");
			break;
		case "GHI":
			System.out.println("Voce vai receber 2x seu salario");
			break;
		default:
			System.out.println("Você não vai receber nada :/");
			break;
		}
	}

	private String geraNivelEmpresarial() {
		int idadeAdminissional = this.calculaIdadeAdmisao();
		if (idadeAdminissional > 5 && idadeAdminissional < 15) {
			return "ABC";
		} else if (idadeAdminissional > 15 && idadeAdminissional < 30) {
			return "DEF";
		} else if (idadeAdminissional > 30) {
			return "GHI";
		} else {
			return "";
		}
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getMesAdmisao() {
		return mesAdmisao;
	}

	public void setMesAdmisao(int mesAdmisao) {
		this.mesAdmisao = mesAdmisao;
	}

	public int getAnoAdmisao() {
		return anoAdmisao;
	}

	public void setAnoAdmisao(int anoAdmisao) {
		this.anoAdmisao = anoAdmisao;
	}

}
