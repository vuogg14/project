package Hw2_22001666_LeMinhVuong.ex1;

import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.chart.*;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LineChart extends Application {
    public static void main(String[] args) {
        launch(args);
    }


    public static BarChart chart() {
        Random rd = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("NHẬP SỐ LƯỢNG PHẦN TỬ: ");
        int[] a = new int[in.nextInt()];
        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt((int) 1e6);
        }

        long[] copy = Arrays.copyOf(dataSort(a), 5);
        System.out.println(Arrays.toString(copy));

        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setLabel("Algorithm");

        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Times (ms)");


        XYChart.Series data = new XYChart.Series();
        data.setName("Sort");

        data.getData().add(new XYChart.Data("Bubble Sort", copy[0]));
        data.getData().add(new XYChart.Data("insertion sort", copy[1]));
        data.getData().add(new XYChart.Data("selection sort", copy[2]));
        data.getData().add(new XYChart.Data("merge sort", copy[3]));
        data.getData().add(new XYChart.Data("quick sort", copy[4]));

        BarChart line = new BarChart(xAxis, yAxis);
        line.getData().addAll(data);

        line.setTitle("Time Chart");
        return line;
    }

    @Override
    public void start(Stage stage)  {
        stage.setTitle("Sort");
        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(chart());
        stage.setScene(new Scene(stackPane, 600, 400));
        stage.show();
    }

    private static long[] dataSort(int[] a) {
        AbsSort bubbleSort = new BubbleSort(Arrays.copyOf(a, a.length));
        bubbleSort.sort();
        AbsSort insertionSort = new InsertionSort(Arrays.copyOf(a, a.length));
        insertionSort.sort();
        AbsSort selection = new SelectionSort(Arrays.copyOf(a, a.length));
        selection.sort();
        AbsSort merge = new MergeSort(Arrays.copyOf(a, a.length));
        merge.sort();
        AbsSort quick = new QuickSort(Arrays.copyOf(a, a.length));
        quick.sort();
        long[] dataTime = new long[]{bubbleSort.getTimes(),
                                    insertionSort.getTimes(),
                                    selection.getTimes(),
                                    merge.getTimes(),
                                    quick.getTimes()};
        return dataTime;
    }
}
