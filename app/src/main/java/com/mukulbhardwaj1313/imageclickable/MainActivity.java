package com.mukulbhardwaj1313.imageclickable;

import static android.widget.Toast.LENGTH_SHORT;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSpinner;

import com.mukulbhardwaj1313.clickableareasimage.ClickableArea;
import com.mukulbhardwaj1313.clickableareasimage.ClickableAreasImage;
import com.mukulbhardwaj1313.clickableareasimage.OnClickableAreaClickedListener;

import java.util.ArrayList;
import java.util.List;

import mukulbhardwaj1313.imageclickable.R;

public class MainActivity extends AppCompatActivity implements OnClickableAreaClickedListener<State> {

//    private double multiplicationFactor = 1.0;
    List<ClickableArea> clickableAreas;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
//        float screenDensity = getResources().getDisplayMetrics().density;
//        multiplicationFactor = 2.625 / screenDensity;
//        multiplicationFactor =  screenDensity;


        ImageView image = findViewById(R.id.imageView);
        AppCompatSpinner spinner = findViewById(R.id.spinner);







        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                               
                switch (((TextView)view ).getText().toString()) {
                    case "Chest Freezer" : {
                        image.setImageResource(R.drawable.chestfreezer);
                        clickableAreas = getClickableAreasCFCCGSL();
                        ClickableAreasImage clickableAreasImage = new ClickableAreasImage(image, MainActivity.this);
                        clickableAreasImage.setClickableAreas(clickableAreas);
                        break;
                    }
                    case "Water Cooler" : {
                        image.setImageResource(R.drawable.watercooler);
                        clickableAreas = getClickableAreasWaterCooler();
                        ClickableAreasImage clickableAreasImage = new ClickableAreasImage(image, MainActivity.this);
                        clickableAreasImage.setClickableAreas(clickableAreas);
                        break;
                    }
                    case "Visi Cooler" : {
                        image.setImageResource(R.drawable.visicooler);
                        clickableAreas = getClickableAreasVisiCooler();
                        ClickableAreasImage clickableAreasImage = new ClickableAreasImage(image, MainActivity.this);
                        clickableAreasImage.setClickableAreas(clickableAreas);
                        break;
                    }
                    case "Bottom Mount Ref" : {
                        image.setImageResource(R.drawable.ffgasleaks);
                        clickableAreas = getffGasLeakClickableAreas();
                        ClickableAreasImage clickableAreasImage = new ClickableAreasImage(image, MainActivity.this);
                        clickableAreasImage.setClickableAreas(clickableAreas);
                        break;
                    }
                    case "Window" : {
                        image.setImageResource(R.drawable.window_ac);
                        clickableAreas = getClickableAreas();
                        ClickableAreasImage clickableAreasImage = new ClickableAreasImage(image, MainActivity.this);
                        clickableAreasImage.setClickableAreas(clickableAreas);
                        break;
                    }
                    case "Split" : {
                        image.setImageResource(R.drawable.gas_charging_img);
                        clickableAreas = getClickableAreas();
                        ClickableAreasImage clickableAreasImage = new ClickableAreasImage(image, MainActivity.this);
                        clickableAreasImage.setClickableAreas(clickableAreas);

                        break;
                    }
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                image.setImageResource(R.drawable.gas_charging_img);
                clickableAreas = getClickableAreas();
                ClickableAreasImage clickableAreasImage = new ClickableAreasImage(image, MainActivity.this);
                clickableAreasImage.setClickableAreas(clickableAreas);
            }

        }); 


    }
//    @NonNull
//    private List<ClickableArea> getClickableAreasWindowsAC() {
//        List<ClickableArea> clickableAreas = new ArrayList();
//
//
//        clickableAreas.add(new ClickableArea((int) (186 * multiplicationFactor), (int) (159 * multiplicationFactor),
//                (int) (30 * multiplicationFactor), (int) (30 * multiplicationFactor), new State(STRINGS.WINDOW_4A))); //4A
//        clickableAreas.add(new ClickableArea((int) (215 * multiplicationFactor), (int) (176 * multiplicationFactor),
//                (int) (40 * multiplicationFactor), (int) (22 * multiplicationFactor), new State(STRINGS.WINDOW_4B))); //4B
//
//
//        clickableAreas.add(new ClickableArea((int) (222 * multiplicationFactor), (int) (35 * multiplicationFactor),
//                (int) (40 * multiplicationFactor), (int) (15 * multiplicationFactor), new State(STRINGS.WINDOW_4A))); //4A
//
//        clickableAreas.add(new ClickableArea((int) (222 * multiplicationFactor), (int) (53 * multiplicationFactor),
//                (int) (40 * multiplicationFactor), (int) (15 * multiplicationFactor), new State(STRINGS.WINDOW_4C))); //4C
//
//        clickableAreas.add(new ClickableArea((int) (114 * multiplicationFactor), (int) (140 * multiplicationFactor),
//                (int) (20 * multiplicationFactor), (int) (20 * multiplicationFactor), new State(STRINGS.WINDOW_1C))); //1C
//
//
//        clickableAreas.add(new ClickableArea((int) (12 * multiplicationFactor), (int) (36 * multiplicationFactor),
//                (int) (23 * multiplicationFactor), (int) (12 * multiplicationFactor), new State(STRINGS.WINDOW_2A))); //2A
//
//        clickableAreas.add(new ClickableArea((int) (10 * multiplicationFactor), (int) (180 * multiplicationFactor),
//                (int) (25 * multiplicationFactor), (int) (12 * multiplicationFactor), new State(STRINGS.WINDOW_2B))); //2B
//
//        /**-->**/
//        clickableAreas.add(new ClickableArea((int) (50 * multiplicationFactor), (int) (168 * multiplicationFactor),
//                (int) (16 * multiplicationFactor), (int) (20 * multiplicationFactor), new State(STRINGS.WINDOW_2A))); //2A
//
//        clickableAreas.add(new ClickableArea((int) (70 * multiplicationFactor), (int) (175 * multiplicationFactor),
//                (int) (30 * multiplicationFactor), (int) (16 * multiplicationFactor), new State(STRINGS.WINDOW_1C))); //1C
//
//        clickableAreas.add(new ClickableArea((int) (55 * multiplicationFactor), (int) (148 * multiplicationFactor),
//                (int) (30 * multiplicationFactor), (int) (16 * multiplicationFactor), new State(STRINGS.WINDOW_1B))); //1B
//
//
//        clickableAreas.add(new ClickableArea((int) (40 * multiplicationFactor), (int) (16 * multiplicationFactor),
//                (int) (50 * multiplicationFactor), (int) (25 * multiplicationFactor), new State(STRINGS.WINDOW_5A))); //5A
//
//        clickableAreas.add(new ClickableArea((int) (100 * multiplicationFactor), (int) (10 * multiplicationFactor),
//                (int) (30 * multiplicationFactor), (int) (25 * multiplicationFactor), new    State(STRINGS.WINDOW_5A))); //5A
//
//        clickableAreas.add(new ClickableArea((int) (130 * multiplicationFactor), (int) (15 * multiplicationFactor),
//                (int) (15 * multiplicationFactor), (int) (10 * multiplicationFactor), new State(STRINGS.WINDOW_5B))); //5B
//
//
//        clickableAreas.add(new ClickableArea((int) (90 * multiplicationFactor), (int) (55 * multiplicationFactor),
//                (int) (48 * multiplicationFactor), (int) (35 * multiplicationFactor), new State(STRINGS.WINDOW_3C))); //3C
//
//        clickableAreas.add(new ClickableArea((int) (100 * multiplicationFactor), (int) (100 * multiplicationFactor),
//                (int) (20 * multiplicationFactor), (int) (32 * multiplicationFactor), new State(STRINGS.WINDOW_1A))); //1A
//
//        return clickableAreas;
//    }

    @NonNull
    private List<ClickableArea> getClickableAreasCFCCGSL() {
        List<ClickableArea> clickableAreas = new ArrayList();
        clickableAreas.add(new ClickableArea(288, 272, 43, 48, new State("Comp Suction")));
        clickableAreas.add(new ClickableArea(288, 243, 42, 26, new State("Comp Suction")));
        clickableAreas.add(new ClickableArea(162, 367, 37, 27, new State("Comp Discharge")));
        clickableAreas.add(new ClickableArea(192, 374, 30, 33, new State("Comp Discharge")));
        clickableAreas.add(new ClickableArea(263, 379, 43, 41, new State("Comp Charge Port")));
        clickableAreas.add(new ClickableArea(299, 401, 42, 28, new State("Comp Charge Port")));
        clickableAreas.add(new ClickableArea(147, 469, 42, 26, new State("Condenser Inlet")));
        clickableAreas.add(new ClickableArea(130, 437, 41, 35, new State("Condenser Inlet")));
        clickableAreas.add(new ClickableArea(20, 76, 42, 27, new State("Condenser Outlet")));
        clickableAreas.add(new ClickableArea(67, 86, 42, 43, new State("Condenser Outlet")));
        clickableAreas.add(new ClickableArea(64, 109, 93, 336, new State("Condenser")));
        clickableAreas.add(new ClickableArea(6, 237, 46, 28, new State("Condenser")));
        clickableAreas.add(new ClickableArea(113, 29, 123, 52, new State("Filter Drier")));
        clickableAreas.add(new ClickableArea(164, 81, 40, 28, new State("Filter Drier")));
        clickableAreas.add(new ClickableArea(238, 71, 41, 28, new State("Charging Tube")));
        clickableAreas.add(new ClickableArea(263, 18, 83, 45, new State("Capillary")));
        clickableAreas.add(new ClickableArea(283, 64, 41, 29, new State("Capillary")));
        clickableAreas.add(new ClickableArea(463, 38, 44, 34, new State("Reducer Inlet")));
        clickableAreas.add(new ClickableArea(465, 73, 43, 27, new State("Reducer Inlet")));
        clickableAreas.add(new ClickableArea(588, 87, 43, 37, new State("Evaporator Inlet")));
        clickableAreas.add(new ClickableArea(624, 74, 40, 27, new State("Evaporator Inlet")));
        clickableAreas.add(new ClickableArea(501, 413, 41, 29, new State("Evaporator Outlet")));
        clickableAreas.add(new ClickableArea(520, 434, 46, 30, new State("Evaporator Outlet")));
        clickableAreas.add(new ClickableArea(534, 109, 91, 336, new State("Evaporator Coil")));
        clickableAreas.add(new ClickableArea(636, 259, 40, 27, new State("Evaporator Coil")));
        clickableAreas.add(new ClickableArea(371, 242, 42, 27, new State("Suction Tube")));
        clickableAreas.add(new ClickableArea(369, 269, 45, 50, new State("Suction Tube")));
        return clickableAreas;
    }

    @NonNull
    private List<ClickableArea> getClickableAreasWaterCooler() {
        List<ClickableArea> clickableAreas = new ArrayList();
        clickableAreas.add(new ClickableArea(288, 272, 43, 48, new State("Comp Suction")));
        clickableAreas.add(new ClickableArea(288, 243, 42, 26, new State("Comp Suction")));
        clickableAreas.add(new ClickableArea(162, 367, 37, 27, new State("Comp Discharge")));
        clickableAreas.add(new ClickableArea(192, 374, 30, 33, new State("Comp Discharge")));
        clickableAreas.add(new ClickableArea(263, 379, 43, 41, new State("Comp Charge Port")));
        clickableAreas.add(new ClickableArea(299, 401, 42, 28, new State("Comp Charge Port")));
        clickableAreas.add(new ClickableArea(147, 469, 42, 26, new State("Condenser Inlet")));
        clickableAreas.add(new ClickableArea(130, 437, 41, 35, new State("Condenser Inlet")));
        clickableAreas.add(new ClickableArea(20, 76, 42, 27, new State("Condenser Outlet")));
        clickableAreas.add(new ClickableArea(67, 86, 42, 43, new State("Condenser Outlet")));
        clickableAreas.add(new ClickableArea(64, 109, 93, 336, new State("Condenser")));
        clickableAreas.add(new ClickableArea(6, 237, 44, 28, new State("Condenser")));
        clickableAreas.add(new ClickableArea(113, 29, 123, 52, new State("Filter Drier")));
        clickableAreas.add(new ClickableArea(164, 81, 40, 28, new State("Filter Drier")));
        clickableAreas.add(new ClickableArea(238, 71, 41, 28, new State("Charging Tube")));
        clickableAreas.add(new ClickableArea(263, 18, 83, 45, new State("Capillary")));
        clickableAreas.add(new ClickableArea(283, 64, 41, 29, new State("Capillary")));
        clickableAreas.add(new ClickableArea(463, 38, 44, 34, new State("Evaporator Inlet")));
        clickableAreas.add(new ClickableArea(465, 73, 43, 27, new State("Evaporator Inlet")));
        clickableAreas.add(new ClickableArea(433, 415, 42, 27, new State("Evaporator Outlet")));
        clickableAreas.add(new ClickableArea(475, 419, 48, 31, new State("Evaporator Outlet")));
        clickableAreas.add(new ClickableArea(531, 108, 94, 335, new State("Evaporator Coil")));
        clickableAreas.add(new ClickableArea(641, 251, 40, 26, new State("Evaporator Coil")));
        clickableAreas.add(new ClickableArea(371, 242, 42, 27, new State("Suction Tube")));
        clickableAreas.add(new ClickableArea(369, 269, 45, 50, new State("Suction Tube")));
        return clickableAreas;
    }

    @NonNull
    private List<ClickableArea> getClickableAreasVisiCooler() {
        List<ClickableArea> clickableAreas = new ArrayList();
        clickableAreas.add(new ClickableArea(288, 272, 43, 48, new State("Comp Suction")));
        clickableAreas.add(new ClickableArea(288, 243, 42, 26, new State("Comp Suction")));
        clickableAreas.add(new ClickableArea(162, 367, 37, 27, new State("Comp Discharge")));
        clickableAreas.add(new ClickableArea(192, 374, 37, 33, new State("Comp Discharge")));
        clickableAreas.add(new ClickableArea(263, 379, 43, 41, new State("Comp Charge Port")));
        clickableAreas.add(new ClickableArea(299, 401, 42, 28, new State("Comp Charge Port")));
        clickableAreas.add(new ClickableArea(147, 469, 42, 26, new State("Condenser Inlet")));
        clickableAreas.add(new ClickableArea(130, 437, 41, 35, new State("Condenser Inlet")));
        clickableAreas.add(new ClickableArea(20, 76, 42, 27, new State("Condenser Outlet")));
        clickableAreas.add(new ClickableArea(67, 86, 42, 43, new State("Condenser Outlet")));
        clickableAreas.add(new ClickableArea(64, 109, 93, 336, new State("Condenser")));
        clickableAreas.add(new ClickableArea(6, 237, 44, 28, new State("Condenser")));
        clickableAreas.add(new ClickableArea(113, 29, 123, 52, new State("Filter Drier")));
        clickableAreas.add(new ClickableArea(164, 81, 40, 28, new State("Filter Drier")));
        clickableAreas.add(new ClickableArea(238, 71, 41, 28, new State("Charging Tube")));
        clickableAreas.add(new ClickableArea(263, 18, 83, 45, new State("Capillary")));
        clickableAreas.add(new ClickableArea(283, 64, 41, 29, new State("Capillary")));
        clickableAreas.add(new ClickableArea(463, 38, 44, 34, new State("Evaporator Inlet")));
        clickableAreas.add(new ClickableArea(465, 73, 43, 27, new State("Evaporator Inlet")));
        clickableAreas.add(new ClickableArea(549, 457, 42, 25, new State("Evaporator Outlet")));
        clickableAreas.add(new ClickableArea(503, 426, 45, 32, new State("Evaporator Outlet")));
        clickableAreas.add(new ClickableArea(533, 109, 93, 335, new State("Evaporator Coil")));
        clickableAreas.add(new ClickableArea(641, 251, 41, 28, new State("Evaporator Coil")));
        clickableAreas.add(new ClickableArea(469, 377, 55, 59, new State("Header")));
        clickableAreas.add(new ClickableArea(445, 361, 39, 26, new State("Header")));
        clickableAreas.add(new ClickableArea(371, 242, 42, 27, new State("Suction Tube")));
        clickableAreas.add(new ClickableArea(369, 269, 45, 50, new State("Suction Tube")));
        return clickableAreas;
    }

    @NonNull
    private List<ClickableArea> getClickableAreas() {

        List<ClickableArea> clickableAreas = new ArrayList<>();

//        clickableAreas.add(new ClickableArea(32,472,))

        clickableAreas.add(new ClickableArea(279, 253, 43, 29, new State("Comp Suction")));
        clickableAreas.add(new ClickableArea(278, 286, 45, 48, new State("Comp Suction")));

        clickableAreas.add(new ClickableArea(150, 382, 38, 30, new State("Comp Discharge")));
        clickableAreas.add(new ClickableArea(178, 392, 40, 31, new State("Comp Discharge")));

        clickableAreas.add(new ClickableArea(225, 457, 43, 29, new State("Suction Discharge Pipe")));
        clickableAreas.add(new ClickableArea(178, 449, 40, 32, new State("Suction Discharge Pipe")));
        clickableAreas.add(new ClickableArea(324, 371, 38, 30, new State("Suction Discharge Pipe")));

        clickableAreas.add(new ClickableArea(134, 486, 43, 29, new State("Condenser Inlet/Outlet")));
        clickableAreas.add(new ClickableArea(118, 454, 40, 36, new State("Condenser Inlet/Outlet")));
        clickableAreas.add(new ClickableArea(20, 89, 43, 29, new State("Condenser Inlet/Outlet")));
        clickableAreas.add(new ClickableArea(53, 94, 42, 43, new State("Condenser Inlet/Outlet")));

        clickableAreas.add(new ClickableArea(10, 481, 45, 28, new State("Condenser U/Return Bends")));
        clickableAreas.add(new ClickableArea(47, 472, 61, 39, new State("Condenser U/Return Bends")));

        clickableAreas.add(new ClickableArea(369, 370, 38, 29, new State("Suction Valve Leak")));

        clickableAreas.add(new ClickableArea(369, 125, 39, 27, new State("Discharge Valve Leak")));

        clickableAreas.add(new ClickableArea(229, 143, 127, 69, new State("H/C Reversing Valve")));
        clickableAreas.add(new ClickableArea(347, 200, 43, 26, new State("H/C Reversing Valve")));

        clickableAreas.add(new ClickableArea(589, 103, 43, 22, new State("Eva Coil Inlet/Out Let")));
        clickableAreas.add(new ClickableArea(517, 451, 48, 30, new State("Eva Coil Inlet/Out Let")));
        clickableAreas.add(new ClickableArea(496, 432, 43, 29, new State("Eva Coil Inlet/Out Let")));
        clickableAreas.add(new ClickableArea(636, 101, 43, 27, new State("Eva Coil Inlet/Out Let")));

        clickableAreas.add(new ClickableArea(573, 474, 48, 33, new State("Eva Coil U/Return Bend")));
        clickableAreas.add(new ClickableArea(627, 474, 41, 27, new State("Eva Coil U/Return Bend")));

        clickableAreas.add(new ClickableArea(634, 138, 44, 30, new State("Distributor")));

        clickableAreas.add(new ClickableArea(100, 34, 127, 53, new State("Capillary/Strainer")));
        clickableAreas.add(new ClickableArea(172, 90, 43, 28, new State("Capillary/Strainer")));
        clickableAreas.add(new ClickableArea(246, 24, 82, 48, new State("Capillary/Strainer")));
        clickableAreas.add(new ClickableArea(267, 73, 41, 28, new State("Capillary/Strainer")));

        clickableAreas.add(new ClickableArea(464, 254, 41, 54, new State("Flare Nut Crack IDU")));
        clickableAreas.add(new ClickableArea(464, 310, 46, 52, new State("Flare Nut Leak IDU")));
        clickableAreas.add(new ClickableArea(411, 257, 43, 50, new State("Flare Nut Crack ODU")));
        clickableAreas.add(new ClickableArea(411, 307, 42, 53, new State("Flare Nut Leak ODU")));

        clickableAreas.add(new ClickableArea(465, 12, 41, 54, new State("Flare Nut Crack IDU")));
        clickableAreas.add(new ClickableArea(464, 61, 46, 52, new State("Flare Nut Leak IDU")));
        clickableAreas.add(new ClickableArea(411, 8, 43, 50, new State("Flare Nut Crack ODU")));
        clickableAreas.add(new ClickableArea(411, 60, 42, 53, new State("Flare Nut Leak ODU")));

        clickableAreas.add(new ClickableArea(386, 434, 38, 27, new State("Installation Piping")));
        clickableAreas.add(new ClickableArea(539, 12, 40, 27, new State("Installation Piping")));


        return clickableAreas;
    }


    @NonNull
    private List<ClickableArea> getffGasLeakClickableAreas() {
        List<ClickableArea> clickableAreas = new ArrayList();
        // 502,525,439,462
        clickableAreas.add(new ClickableArea(354, 431, 21, 21, new State("Compressor Discharge Joint")));
        clickableAreas.add(new ClickableArea(348, 460, 21, 21, new State("Compressor Discharge Joint")));
        clickableAreas.add(new ClickableArea(377, 482, 21, 21, new State("Compressor Discharge Joint")));
        clickableAreas.add(new ClickableArea(187, 370, 21, 21, new State("Compressor Suction Joint")));
        clickableAreas.add(new ClickableArea(159, 407, 21, 21, new State("Compressor Suction Joint")));
        clickableAreas.add(new ClickableArea(190, 426, 21, 21, new State("Compressor Suction Joint")));
        clickableAreas.add(new ClickableArea(266, 366, 21, 21, new State("Compressor Charging Joint")));
        clickableAreas.add(new ClickableArea(292, 378, 21, 21, new State("Compressor Charging Joint")));
        clickableAreas.add(new ClickableArea(321, 355, 21, 21, new State("Compressor Charging Joint")));
        clickableAreas.add(new ClickableArea(267, 318, 21, 21, new State("Charging Pipe-Pinching Point")));
        clickableAreas.add(new ClickableArea(252, 295, 21, 21, new State("Charging Pipe-Pinching Point")));
        clickableAreas.add(new ClickableArea(281, 278, 21, 21, new State("Charging Pipe-Pinching Point")));
        clickableAreas.add(new ClickableArea(299, 83, 21, 21, new State("Dryer-Condenser Joint")));
        clickableAreas.add(new ClickableArea(332, 60, 21, 21, new State("Dryer-Condenser Joint")));
        clickableAreas.add(new ClickableArea(307, 27, 21, 21, new State("Dryer-Condenser Joint")));
        clickableAreas.add(new ClickableArea(466, 27, 21, 21, new State("Dryer-Punching Point")));
        clickableAreas.add(new ClickableArea(495, 32, 21, 21, new State("Dryer-Punching Point")));
        clickableAreas.add(new ClickableArea(530, 9, 21, 21, new State("Dryer-Punching Point")));
        clickableAreas.add(new ClickableArea(430, 423, 21, 21, new State("Hot Loop-Condenser In")));
        clickableAreas.add(new ClickableArea(417, 466, 21, 21, new State("Hot Loop-Condenser In")));
        clickableAreas.add(new ClickableArea(453, 491, 21, 21, new State("Hot Loop-Condenser In")));
        clickableAreas.add(new ClickableArea(537, 421, 21, 21, new State("Condenser out-Joint")));
        clickableAreas.add(new ClickableArea(502, 446, 21, 21, new State("Condenser out-Joint")));
        clickableAreas.add(new ClickableArea(477, 434, 21, 21, new State("Condenser out-Joint")));
        clickableAreas.add(new ClickableArea(58, 90, 50, 50, new State("Evaporator-Capillary Joint")));
        clickableAreas.add(new ClickableArea(4, 81, 50, 50, new State("Evaporator-Capillary Joint")));
        clickableAreas.add(new ClickableArea(40, 60, 50, 50, new State("Evaporator-Capillary Joint")));
        clickableAreas.add(new ClickableArea(7, 312, 50, 50, new State("Evaporator-Suction Joint")));
        clickableAreas.add(new ClickableArea(36, 332, 50, 50, new State("Evaporator-Suction Joint")));
        clickableAreas.add(new ClickableArea(62, 311, 50, 50, new State("Evaporator-Suction Joint")));


        return clickableAreas;
    }
    @Override
    public void onClickableAreaTouched(State item) {
        Toast.makeText( this,item.getName(),LENGTH_SHORT).show();

    }
}
