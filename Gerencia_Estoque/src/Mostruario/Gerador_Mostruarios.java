package Mostruario;

import Connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

public class Gerador_Mostruarios {

    private Connection conexao;

    public Gerador_Mostruarios() throws SQLException {
        this.conexao = ConnectionFactory.getConexao();
    }

    public void gerar(String layout, String mostruario) throws JRException, SQLException, ClassNotFoundException {
        //gerando o jasper design

        JasperDesign desenho = JRXmlLoader.load(layout);

        //compila o relatório

        JasperReport relatorio = JasperCompileManager.compileReport(desenho);

        //estabelece conexão

        String query = "select mostruario,artigo,tipo,preco from tecidos where mostruario = '" + mostruario + "' order by artigo";


        java.sql.PreparedStatement stmt = this.conexao.prepareStatement(query);

        ResultSet rs = stmt.executeQuery();

        //implementação da interface JRDataSource para DataSource ResultSet
        JRResultSetDataSource jrRS = new JRResultSetDataSource(rs);

        //executa o relatório
        HashMap parametros = new HashMap();


        parametros.put("mostruario", new Double(10));
        JasperPrint impressao = JasperFillManager.fillReport(relatorio, parametros, jrRS);
        //JasperPrint impressao = JasperFillManager.fillReport( relatorio);

        //exibe o resultado

        JasperExportManager.exportReportToPdfFile(impressao, "C:/Gerencia_Estoque/pdfs/mostruarios/Mostruario-" + mostruario + ".pdf");

        /*JasperViewer viewer = new JasperViewer( impressao , true );
         viewer.show();*/
    }
}