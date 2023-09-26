package com.example.listview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import androidx.appcompat.app.AppCompatActivity;

public class AutoComplate extends AppCompatActivity {
    private AutoCompleteTextView autoCompleteTextView;
    private String[] countries = {"Afghanistan", "Afrika Selatan", "Albania", "Aljazair", "Amerika Serikat",
            "Andorra", "Angola", "Antigua dan Barbuda", "Arab Saudi", "Argentina",
            "Armenia", "Australia", "Austria", "Azerbaijan", "Bahama", "Bahrain",
            "Bangladesh", "Barbados", "Belarus", "Belgia", "Belize", "Benin",
            "Bhutan", "Bolivia", "Bosnia dan Herzegovina", "Botswana", "Brasil",
            "Brunei", "Bulgaria", "Burkina Faso", "Burundi", "Ceko", "Chad",
            "Chili", "Cina", "Colombia", "Comoros", "Costa Rica", "Croatia",
            "Cuba", "Denmark", "Djibouti", "Dominika", "Ekuador", "El Salvador",
            "Eritrea", "Estonia", "Eswatini", "Ethiopia", "Fiji", "Filipina",
            "Finlandia", "Gabon", "Gambia", "Georgia", "Ghana", "Grenada",
            "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras",
            "Hongaria", "India", "Indonesia", "Inggris Raya", "Irak", "Iran",
            "Irlandia", "Islandia", "Israel", "Italia", "Jamaika", "Jepang",
            "Yordania", "Kamboja", "Kamerun", "Kanada", "Kazakhstan", "Kenya",
            "Kirgistan", "Kiribati", "Kolombia", "Komoro", "Kongo (Brazzaville)",
            "Kongo (Kinshasa)", "Korea Selatan", "Korea Utara", "Kosovo", "Kosta Rika",
            "Kroasia", "Kuwait", "Laos", "Latvia", "Lebanon", "Lesotho",
            "Liberia", "Libya", "Liechtenstein", "Lituania", "Luksemburg",
            "Madagaskar", "Makau (SAR Tiongkok)", "Makedonia Utara", "Maladewa",
            "Malawi", "Malaysia", "Mali", "Malta", "Maroko", "Mauritania",
            "Mauritius", "Meksiko", "Mesir", "Mikronesia", "Moldova", "Monaco",
            "Mongolia", "Montenegro", "Mozambik", "Myanmar (Burma)", "Namibia",
            "Nauru", "Nepal", "Niger", "Nigeria", "Nikaragua", "Norwegia",
            "Oman", "Pakistan", "Palau", "Palestina", "Panama", "Papua Nugini",
            "Paraguay", "Peru", "Polandia", "Portugal", "Prancis", "Qatar",
            "Republik Afrika Tengah", "Republik Dominika", "Republik Sahara Barat",
            "Republik Uni Tanzania", "Rumania", "Rusia", "Rwanda", "Saint Kitts dan Nevis",
            "Saint Lucia", "Saint Vincent dan Grenadines", "Samoa", "San Marino",
            "Sao Tome dan Principe", "Selandia Baru", "Senegal", "Serbia", "Seychelles",
            "Sierra Leone", "Singapura", "Slovakia", "Slovenia", "Solomon Islands",
            "Somalia", "Spanyol", "Sri Lanka", "Sudan", "Suriah", "Suriname",
            "Swedia", "Swiss", "Tajikistan", "Tanjung Verde", "Tanzania", "Timor Leste",
            "Togo", "Tonga", "Trinidad dan Tobago", "Tunisia", "Turki", "Turkmenistan",
            "Tuvalu", "Uganda", "Ukraina", "Uni Emirat Arab", "Uruguay", "Uzbekistan",
            "Vanuatu", "Vatikan", "Venezuela", "Vietnam", "Yaman", "Zambia", "Zimbabwe"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.autocomplate);

        autoCompleteTextView = findViewById(R.id.autoCompleteTextView);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, countries);
        autoCompleteTextView.setAdapter(adapter);

        getSupportActionBar().setTitle("AutoComplate");
    }
}
