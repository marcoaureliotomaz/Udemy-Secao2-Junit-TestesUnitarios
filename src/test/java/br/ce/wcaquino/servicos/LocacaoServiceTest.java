package br.ce.wcaquino.servicos;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;
import br.ce.wcaquino.utils.DataUtils;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class LocacaoServiceTest {
    @Test
    public  void variostestes() {
        LocacaoService locacaoService = new LocacaoService();
        Usuario usuario = new Usuario("Marco");
        Filme filme = new Filme("Filme 1",2,5.0);

        Locacao locacao = locacaoService.alugarFilme(usuario,filme);

        Assert.assertEquals(5.00,locacao.getValor(),0.01);
        Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataLocacao(),new Date()));
        Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)));




    }
}
