package com.example.handbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    // создание коллекции контейнера для данных класса Animal
    List<Animal> animals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // инициализируем контейнер
        setInitialData();

        // создадим объект RecyclerView и привяжем к нему соответствующий id
        RecyclerView recyclerView = findViewById(R.id.list_animal);

        // создадим адаптер и загрузим в него контейнер с данными
        AnimalAdapter adapter = new AnimalAdapter(this, animals);

        // на recyclerView подадим адаптер
        recyclerView.setAdapter(adapter);
    }
    // метод setInitialData() устанавливает начальный набор данных (а именно изображения из папки res/drawables)
    private void setInitialData() {
        // добавление в контейнер animals объектов сущности Animal
        animals.add( new Animal("Ящерица", "Род хищных пресмыкающих семейства чешуйчащатых",
                R.drawable.lizard, "Численность большая"));
        animals.add( new Animal("Паук", "относится к виду паукообразных ",
                R.drawable.spider, "Численность большая"));
        animals.add( new Animal("Тушканчик", "семейство грызунов. На носу расположены длинные чувствительные усики. На конце длинного хвоста пушистая кисточка.",
                R.drawable.jerboa, "Численность средняя"));
       animals.add( new Animal("Верблюд", "семейство млекопитающих",
                R.drawable.camel, "Численность средняя"));
        animals.add( new Animal("Змея", "Змеи обладают удлинённым телом, без конечностей, средней длиной от 100 мм до ≥700 см, а основное отличие от безногих видов ящериц представлено наличием подвижного соединения челюстей, что позволяет пресмыкающемуся заглатывать свою добычу целиком. Кроме всего прочего, у змей отсутствуют подвижные веки, барабанная перепонка и выраженный плечевой пояс.",
                R.drawable.snake, "Численность большая"));
    }
}