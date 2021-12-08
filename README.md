# mealy_machine
Girdiğiniz degere göre çıkış değeri hesaplayan mealy makinesi
Kullanıcıdan girdi olarak Sonlu durumlar kümesinin eleman sayısını (kümenin ilk elemanı her zaman başlangıç durumudur), Girdi dizisini oluşturmak için semboller alfabesini ve Olası çıktı sembolleri alfabesini alacaktır. Kullanıcıdan bilgi alışını arayüz aracılığıyla yapabileceğiniz gibi bir text (INPUT.TXT) 
dosyadan aşağıdaki formatta almasını sağlayabilirsiniz.
Q: {q0, q1, q2, ....,q10}.
S={a,b}
Γ={0,1}
Her girdi ile durumlar arası geçişin nasıl olduğunu gösteren Geçiş diyagramı bilgileri de kullanıcı tarafından organize edilecektir. Bunlar içinde arayüz tasarlanabileceği gibi tek bir text (GECISDIYAGRAMI.TXT) dosyadan alınması da sağlanabilir. Text dosyada ilk satırlar başlık satırları ilk sütunlarda durum sütunları olacaktır.
Her bir öğe arası TAB karakteri ile ayrılmış olacaktır. Her geçiş “i/o” şeklindedir.
![image](https://user-images.githubusercontent.com/60337657/145260263-df067c7f-321c-40f7-ab86-839d4e63213f.png)
Program ilk a.ıldığında karşımıza böyle sayfa çıkacak

------------------------------------------------------------------------------------------------------------------------
![image](https://user-images.githubusercontent.com/60337657/145260501-1186191e-e4b1-4c4a-b85f-d5d6f8b6b574.png)
Moore makinesinden farklı olarak mealy makinesinde çıktı ve state boyutu sadece girdi boyutuna eşit olur

------------------------------------------------------------------------------------------------------------------------
![image](https://user-images.githubusercontent.com/60337657/145260786-212ab19e-3049-4d1d-9f62-9a5eaf8c68eb.png)
Mealy makinesinin tablosunu baştan sona kendimiz manuel olarak oluşturabiliriz

------------------------------------------------------------------------------------------------------------------------
Ve başta olduğu gibi, tabloya belirtilen giriş, çıkış, state kümeleri dışında bir değer girersek uyarı alırız. O sırada kelime gireceğimiz input 
textfield kapanır, tabloyu düzeltince geri düzelir. 
Başarılar))
