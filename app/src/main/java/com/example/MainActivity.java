package com.example;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        getWindow().setNavigationBarColor(Color.TRANSPARENT);
        setContentView(R.layout.activity_main);

        ListView guideListView = findViewById(R.id.music_list);
        Item item1 = new Item("广州塔","广州塔（英语：Canton Tower）又称广州新电视塔，昵称小蛮腰，其位于中国广东省广州市海珠区（艺洲岛）赤岗塔附近，距离珠江南岸125米，与珠江新城、花城广场、海心沙岛隔江相望。",
                                R.drawable.guangzhoutower);
        Item item2 = new Item("海心桥","心桥是广州首座珠江两岸人行桥，是世界上跨度最大、宽度最宽的曲梁斜拱人行桥。桥形设计植根岭南文化，造型概念来自“琴鸣绢舞·岭南花舟”，将桥梁完美地融入广州中轴线步行系统。",
                                R.drawable.bridge);
        Item item3 = new Item("广州东方博物馆","广州东方博物馆是国内公助民办的大型综合非国有博物馆，位于广州番禺区石楼镇浮莲路118号亚运文化村内，是亚运会的文化配套项目。 博物馆依山傍水，环境清幽，风光旖旎。",
                                R.drawable.museum);
        Item item4 = new Item("毓灵桥","毓（yù）灵桥，位于广州市荔湾区（原芳村区政府东南），冲口街辖内，横跨大冲口涌。毓灵桥，始建于清代中叶，桥名\"毓灵\"是因历史上此地属钟秀乡，取其\"钟灵毓秀\"之意，故名。",
                                R.drawable.bridge2);
        Item item5 = new Item("石室圣心大教堂","石室圣心大教堂，位于广州市越秀区一德路。圣心大教堂于1863年6月18日圣心瞻礼日正式举行奠基典礼，故命名圣心大教堂。历时25年始建成，是天主教广州教区最宏伟、最具有特色的一间大教堂。",
                                R.drawable.stone);
        Item item6 = new Item("花城广场","花城广场被誉为广州“城市客厅”，是广州市最大的广场，2010年10月25日起全面向市民开放。该广场位于广州市城市新中轴线珠江新城核心节点，东起冼村路，西至华夏路，北靠黄埔大道，南临海心沙。",
                                R.drawable.square);
        ArrayList<Item> itemList = new ArrayList<>();
        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);
        guideListView.setAdapter(new ItemAdapter(this,R.layout.item,itemList));
    }
}