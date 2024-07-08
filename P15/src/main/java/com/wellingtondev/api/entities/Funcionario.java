package com.wellingtondev.api.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import com.wellingtondev.api.enums.PerfilEnum;

public class Funcionario implements Serializable{

	
	private static final long serialVersionUID = 7358484359835500983L;

		private Long id;
		private String nome;
		private String email;
		private String senha;
		private String cpf;
		private BigDecimal valorHora;
		private Float qtdHorasTrabalhoDia;
		private Float qtdHodasAlmoco;
		private PerfilEnum perfil;
		private Date dataCriacao;
		private Date dataAtualizacao;
		private Empresa empresa;
		private List<Lancamento> lancamento;
		
		public Funcionario() {
			super();
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public BigDecimal getValorHora() {
			return valorHora;
		}

		public void setValorHora(BigDecimal valorHora) {
			this.valorHora = valorHora;
		}

		public Float getQtdHorasTrabalhoDia() {
			return qtdHorasTrabalhoDia;
		}

		public void setQtdHorasTrabalhoDia(Float qtdHorasTrabalhoDia) {
			this.qtdHorasTrabalhoDia = qtdHorasTrabalhoDia;
		}

		public Float getQtdHodasAlmoco() {
			return qtdHodasAlmoco;
		}

		public void setQtdHodasAlmoco(Float qtdHodasAlmoco) {
			this.qtdHodasAlmoco = qtdHodasAlmoco;
		}

		public PerfilEnum getPerfil() {
			return perfil;
		}

		public void setPerfil(PerfilEnum perfil) {
			this.perfil = perfil;
		}

		public Date getDataCriacao() {
			return dataCriacao;
		}

		public void setDataCriacao(Date dataCriacao) {
			this.dataCriacao = dataCriacao;
		}

		public Date getDataAtualizacao() {
			return dataAtualizacao;
		}

		public void setDataAtualizacao(Date dataAtualizacao) {
			this.dataAtualizacao = dataAtualizacao;
		}

		public Empresa getEmpresa() {
			return empresa;
		}

		public void setEmpresa(Empresa empresa) {
			this.empresa = empresa;
		}

		public List<Lancamento> getLancamento() {
			return lancamento;
		}

		public void setLancamento(List<Lancamento> lancamento) {
			this.lancamento = lancamento;
		}

		@Override
		public String toString() {
			return "Funcionario [id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha + ", cpf=" + cpf
					+ ", valorHora=" + valorHora + ", qtdHorasTrabalhoDia=" + qtdHorasTrabalhoDia + ", qtdHodasAlmoco="
					+ qtdHodasAlmoco + ", perfil=" + perfil + ", dataCriacao=" + dataCriacao + ", dataAtualizacao="
					+ dataAtualizacao + ", empresa=" + empresa + ", lancamento=" + lancamento + "]";
		}
		
		
		
}
