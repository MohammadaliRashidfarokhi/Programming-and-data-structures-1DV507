package mr223_assign3;


import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;

public class SinMain {
    static double pi = 2*Math.PI;
    public static void main(String[] args){
        double[] x = new double[80];
        double[] y = new double[80];
        int pos = 0;
        for(double i = 0; i<pi; i =i+ pi/x.length){
            x[pos++]=i;
        }

        for(int j = 0;j<y.length; j++){
            y[j]=(1 + x[j]/Math.PI)* Math.cos(x[j])*Math.cos(40*x[j]);
        }
        XYChart plot = new XYChartBuilder().width(1000).height(800).xAxisTitle("Age").yAxisTitle("Amount").build();
        plot.addSeries("Plots",x,y);
        new SwingWrapper(plot).displayChart();
    }
}
