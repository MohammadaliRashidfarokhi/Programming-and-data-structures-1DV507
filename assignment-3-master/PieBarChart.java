package mr223_assign3;

import org.knowm.xchart.*;
import org.knowm.xchart.style.Styler;
import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PieBarChart {
    static int x,xx,xxx,xl,l,lx,lxx,lxxx,xc,c;
    private static int[] arr;
    static int pos;

    public static void main(String[] args) throws IOException {
        List<String> fig = Files.lines(Paths.get("C:\\Users\\Ali\\IdeaProjects\\1DV507\\src\\mr223_assign3\\integers.txt")).collect(Collectors.toList());
        fig.removeIf(s-> s == null || s.equals(" ") || s.length()==0);
        arr = new int[fig.size()];
        try{
            for(String x:fig){
                arr[pos++]=Integer.parseInt(x);
            }
        }
        catch (NumberFormatException nfe){
            System.out.println(nfe.getMessage());
        }
        Arrays.sort(arr);
        for (int i:arr){
            if(i<10) {
                x++;
            }else if(i<20){
                xx++;
            }else if(i<30){
                xxx++;
            }else if(i<40){
                xl++;
            }else if(i<50){
                l++;
            }else if(i<60){
                lx++;
            }else if(i<70){
                lxx++;
            }else if(i<80){
                lxxx++;
            }else if(i<90){
                xc++;
            }else{
                c++;
            }
        }
        int[] y = {x,xx,xxx,xl,l,lx,lxx,lxxx,xc,c};
        int[] xd = {10,20,30,40,50,60,70,80,90,100};


        CategoryChart chart = new CategoryChartBuilder().width(800).height(600).title("Bar Chart").xAxisTitle("Intervals").yAxisTitle("Count").build();
        chart.getStyler().setLegendPosition(Styler.LegendPosition.InsideNW);
        chart.getStyler().setHasAnnotations(true);
        chart.addSeries("Numbers",xd,y);
        new SwingWrapper<CategoryChart>(chart).displayChart();

        PieChart pie = new PieChartBuilder().width(800).height(600).title("Pie Chart").build();
        Color[] colors = new Color[]{new Color(254, 170,254), new Color(248, 219,206),
                new Color(230, 105, 62), new Color(120, 250, 150), new Color(212, 171, 198),
                new Color(224,68,14), new Color(180, 170,254),
                new Color(234, 54,200), new Color(144,13,18),new Color(56,130,54)};
        pie.getStyler().setSeriesColors(colors);
        pie.getStyler().setLegendPosition(Styler.LegendPosition.InsideNW);
        pie.addSeries("<10",x);
        pie.addSeries("<20", xx);
        pie.addSeries("<30", xxx);
        pie.addSeries("<40", xl);
        pie.addSeries("<50", l);
        pie.addSeries("<60", lx);
        pie.addSeries("<70", lxx);
        pie.addSeries("<80", lxxx);
        pie.addSeries("<90", xc);
        pie.addSeries("<100", c);

        new SwingWrapper<PieChart>(pie).displayChart();
    }
}
