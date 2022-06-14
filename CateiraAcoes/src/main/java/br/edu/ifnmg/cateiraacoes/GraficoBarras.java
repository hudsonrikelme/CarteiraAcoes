package br.edu.ifnmg.cateiraacoes;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *Coloca as quantidades em um grafico de barras atraves do componente JFreeChart
 * @author Rikelme
 */
public class GraficoBarras implements Observador{

    private DefaultCategoryDataset dataset;
    private JFrame frame = new JFrame();
    
    public GraficoBarras(){
        dataset = new DefaultCategoryDataset();
        JFreeChart chart = ChartFactory.createAreaChart("Carteira de Acoes", "Siglas", 
                "Quantidade", (CategoryDataset) dataset, PlotOrientation.VERTICAL,
                true, true, true);
        ChartPanel chartPanel = new ChartPanel(chart);
        frame.setContentPane(chartPanel);
        frame.setSize(500, 270);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void mudancaQuantidade(String acao, Integer quantidade) {
        dataset.setValue(quantidade, "Quantidade", acao);
        
    }
    
}
