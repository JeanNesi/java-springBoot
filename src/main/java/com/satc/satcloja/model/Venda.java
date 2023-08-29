package com.satc.satcloja.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venda extends EntityId implements OperacaoFinanceira {
    private LocalDate dataVenda;
    private FormaDePagamento formaDePagamento;
    private String observacao;
    private Cliente cliente;

    private List<ItemVenda> itens = new ArrayList<>();

    public void addItemVenda(ItemVenda item) {
        this.itens.add(item);
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public void delItemVenda(ItemVenda item) {
        this.itens.remove(item);
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public FormaDePagamento getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public LocalDate getDataOperacao() {
        return this.getDataVenda();
    }

    @Override
    public Double getValorTotalOperacao() {
        return this.getItens().stream().mapToDouble(ItemVenda::getValorCalculado).sum();
    }

    @Override
    public TipoOperacao getTipoOperacao() {
        return TipoOperacao.CREDITO;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "dataVenda=" + dataVenda +
                ", formaDePagamento=" + formaDePagamento +
                ", observacao='" + observacao + '\'' +
                ", cliente=" + cliente +
                ", itens=" + itens +
                '}';
    }


}
