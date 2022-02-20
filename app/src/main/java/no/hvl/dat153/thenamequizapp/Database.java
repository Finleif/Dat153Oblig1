package no.hvl.dat153.thenamequizapp;

import android.net.Uri;

import java.util.ArrayList;
import java.util.List;

public class Database {

    private List<Person> people;

    private static Database instance = null;

    private Database() {
        people = new ArrayList<>();
        people.add(new Person("Finn Arne",
                Uri.parse("android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.drawable.finn_arne)));
        people.add(new Person("Per Otto",
                Uri.parse("android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.drawable.per_otto)));
        people.add(new Person("Per Helge",
                Uri.parse("android.resource://" + BuildConfig.APPLICATION_ID + "/" + R.drawable.per_helge)));

    }

    public static Database getInstance() {
        if (instance == null) {
            synchronized (Database.class) {
                instance = new Database();
            }
        }
        return instance;
    }

    public List<Person> getPeople() {
        return people;
    }

    public Person get(int position) {
        return people.get(position);
    }
}
