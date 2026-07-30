//0 = not a prime number
for (int i = 0 ; i < nums.length ; i++) {
  if (nums[i] <= 1) { //pengecualian buat 1 not prime
      nums[i] = 0;
  }
  for (int j = 2 ; j * j <= nums[i] ; j++) 
    if (nums[i] % j == 0) {
        nums[i] = 0;
        break; //tambahin break biar ga overwork aja sih
    }
  }
}

/* For J loop
j mulai dari 2 (karena semua angka bisa dibagi 1, jadi ga perlu cek 1).

Syarat j * j <= nums[i] artinya kamu hanya cek pembagi sampai akar kuadrat dari nums[i].

kalau n punya faktor selain 1 dan dirinya sendiri, salah satu faktornya pasti ≤ √n.

Contoh:
Untuk num = 29, kamu cuma perlu cek j = 2, 3, 4, 5 (karena 5*5 = 25 ≤ 29, tapi 6*6 = 36 > 29).
*/

/* For else if logic
Cek apakah nums[i] bisa dibagi habis oleh j.
Kalau iya → berarti punya faktor lain selain 1 dan dirinya sendiri → bukan prime.
*/
