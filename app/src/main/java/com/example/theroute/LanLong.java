package com.example.theroute;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class LanLong {
    private GoogleMap mMap;
    LatLng Lagankhel = new LatLng(27.667264,85.323184);
    LatLng Thankot = new LatLng(27.693287,85.219391);
    LatLng Kalanki = new LatLng(27.693429,85.282465);
    LatLng Kalimati = new LatLng(27.698259,85.299098);
    LatLng Ratnapark = new LatLng(27.701129,85.313494);
    LatLng  PuranoBuspark = new LatLng(27.705476,85.314611);
    LatLng Koteswor = new LatLng(27.679021,85.349490);
    LatLng NayaBuspark = new LatLng(27.7224134, 85.3011652);
    LatLng Gausala = new LatLng(27.706817,85.344710);
    LatLng Chakrapat = new LatLng(27.740193,85.336649);
    LatLng  Chahabil=new LatLng(27.717646,85.346566);
    LatLng KamalVinayek = new LatLng(27.676199,85.437296);
    LatLng Baneshwor = new LatLng(27.688550,85.335026);
    LatLng MaitiGhar = new LatLng(27.693849,85.321262);
    LatLng Balkhu = new LatLng(27.684710,85.297357);
    LatLng EkantaKuna = new LatLng(27.666596,85.308296);
    LatLng Tikathali = new LatLng(27.674677,85.358072);
    LatLng Pepsicola = new LatLng(27.689006,85.360331);
    LatLng Suryabinayek=new LatLng(27.665601,85.425601);



    public LanLong(GoogleMap mmMap){
        this.mMap=mmMap;
    }
    public void forChandragiri(){
        mMap.addMarker(new MarkerOptions().position(Thankot).title("Thankot"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Thankot));
        mMap.addMarker(new MarkerOptions().position(Kalanki).title("Kalanki"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Kalanki));
        mMap.addMarker(new MarkerOptions().position(Kalimati).title("Kalimati"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Kalimati));
        mMap.addMarker(new MarkerOptions().position(Ratnapark).title("Ratnapark"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Ratnapark));
        mMap.addMarker(new MarkerOptions().position(PuranoBuspark).title("PuranoBuspark"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng( PuranoBuspark));
        mMap.addMarker(new MarkerOptions().position(Koteswor).title("Koteswor"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Koteswor));
        mMap.addMarker(new MarkerOptions().position(NayaBuspark).title("NayaBuspark"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(NayaBuspark));
        mMap.addMarker(new MarkerOptions().position(Lagankhel).title("Lagankhel"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lagankhel));
    }
    public void forSundarijal(){
        mMap.addMarker(new MarkerOptions().position(Chakrapat).title("Chakrapat"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Chakrapat));
        mMap.addMarker(new MarkerOptions().position(Ratnapark).title("Ratnapark"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Ratnapark));
        mMap.addMarker(new MarkerOptions().position(PuranoBuspark).title("PuranoBuspark"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng( PuranoBuspark));
        mMap.addMarker(new MarkerOptions().position(Koteswor).title("Koteswor"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Koteswor));
        mMap.addMarker(new MarkerOptions().position(NayaBuspark).title("NayaBuspark"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(NayaBuspark));
        mMap.addMarker(new MarkerOptions().position(Gausala).title("Gausala"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Gausala));
        mMap.addMarker(new MarkerOptions().position(Chahabil).title("Chahabil"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Chahabil));

    }

    public void forSanga(){
        mMap.addMarker(new MarkerOptions().position(KamalVinayek).title("KamalVinayek"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(KamalVinayek));
        mMap.addMarker(new MarkerOptions().position(Baneshwor).title("Baneshwor"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Baneshwor));
        mMap.addMarker(new MarkerOptions().position(MaitiGhar).title("MaitiGhar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(MaitiGhar));
        mMap.addMarker(new MarkerOptions().position(Ratnapark).title("Ratnapark"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Ratnapark));
        mMap.addMarker(new MarkerOptions().position(PuranoBuspark).title("PuranoBuspark"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng( PuranoBuspark));
        mMap.addMarker(new MarkerOptions().position(Koteswor).title("Koteswor"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Koteswor));
        mMap.addMarker(new MarkerOptions().position(NayaBuspark).title("NayaBuspark"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(NayaBuspark));
        mMap.addMarker(new MarkerOptions().position(Lagankhel).title("Lagankhel"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lagankhel));
    }

    public void forRatnapark(){
        mMap.addMarker(new MarkerOptions().position(Baneshwor).title("Baneshwor"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Baneshwor));
        mMap.addMarker(new MarkerOptions().position(Lagankhel).title("Lagankhel"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lagankhel));
        mMap.addMarker(new MarkerOptions().position(Kalanki).title("Kalanki"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng( Kalanki));
        mMap.addMarker(new MarkerOptions().position(Koteswor).title("Koteswor"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Koteswor));
        mMap.addMarker(new MarkerOptions().position(Kalimati).title("Kalimati"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Kalimati));
        mMap.addMarker(new MarkerOptions().position(Balkhu).title("Balkhu"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Balkhu));
    }
    public void forChampadevi(){
        mMap.addMarker(new MarkerOptions().position(Lagankhel).title("Lagankhel"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lagankhel));
        mMap.addMarker(new MarkerOptions().position(Ratnapark).title("Ratnapark"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Ratnapark));
        mMap.addMarker(new MarkerOptions().position(PuranoBuspark).title("PuranoBuspark"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng( PuranoBuspark));
        mMap.addMarker(new MarkerOptions().position(EkantaKuna).title("EkantaKuna"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(EkantaKuna));
    }
    public void forKalnki(){
        mMap.addMarker(new MarkerOptions().position(Ratnapark).title("Ratnapark"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Ratnapark));
        mMap.addMarker(new MarkerOptions().position(PuranoBuspark).title("PuranoBuspark"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng( PuranoBuspark));
        mMap.addMarker(new MarkerOptions().position(Koteswor).title("Koteswor"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Koteswor));
        mMap.addMarker(new MarkerOptions().position(NayaBuspark).title("NayaBuspark"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(NayaBuspark));
        mMap.addMarker(new MarkerOptions().position(Kalimati).title("Kalimati"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Kalimati));
        mMap.addMarker(new MarkerOptions().position(Baneshwor).title("Baneshwor"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng( Baneshwor));
        mMap.addMarker(new MarkerOptions().position(Tikathali).title("Tikathali"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Tikathali));
        mMap.addMarker(new MarkerOptions().position(Pepsicola).title("Pepsicola"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Pepsicola));
        mMap.addMarker(new MarkerOptions().position(Chahabil).title("Chahabil"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Chahabil));
    }
    public void forPilotBaba(){
        mMap.addMarker(new MarkerOptions().position(Ratnapark).title("Ratnapark"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Ratnapark));
        mMap.addMarker(new MarkerOptions().position(PuranoBuspark).title("PuranoBuspark"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng( PuranoBuspark));
        mMap.addMarker(new MarkerOptions().position(Koteswor).title("Koteswor"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Koteswor));
        mMap.addMarker(new MarkerOptions().position(KamalVinayek).title("KamalVinayek"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(KamalVinayek));
        mMap.addMarker(new MarkerOptions().position(Baneshwor).title("Baneshwor"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng( Baneshwor));
        mMap.addMarker(new MarkerOptions().position(Suryabinayek).title("Suryabinayek"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Suryabinayek));
    }
    public void forDolesworMahadev(){
        mMap.addMarker(new MarkerOptions().position(Ratnapark).title("Ratnapark"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Ratnapark));
        mMap.addMarker(new MarkerOptions().position(PuranoBuspark).title("PuranoBuspark"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng( PuranoBuspark));
        mMap.addMarker(new MarkerOptions().position(Koteswor).title("Koteswor"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Koteswor));
        mMap.addMarker(new MarkerOptions().position(KamalVinayek).title("KamalVinayek"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(KamalVinayek));
        mMap.addMarker(new MarkerOptions().position(Baneshwor).title("Baneshwor"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng( Baneshwor));
        mMap.addMarker(new MarkerOptions().position(Suryabinayek).title("Suryabinayek"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Suryabinayek));
    }
    public void forNagarkot(){
        mMap.addMarker(new MarkerOptions().position(KamalVinayek).title("KamalVinayek"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(KamalVinayek));
    }
    public void forDhulikhel(){
        mMap.addMarker(new MarkerOptions().position(Ratnapark).title("Ratnapark"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Ratnapark));
        mMap.addMarker(new MarkerOptions().position(PuranoBuspark).title("PuranoBuspark"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng( PuranoBuspark));
        mMap.addMarker(new MarkerOptions().position(Koteswor).title("Koteswor"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Koteswor));
        mMap.addMarker(new MarkerOptions().position(KamalVinayek).title("KamalVinayek"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(KamalVinayek));
        mMap.addMarker(new MarkerOptions().position(Baneshwor).title("Baneshwor"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng( Baneshwor));
        mMap.addMarker(new MarkerOptions().position(Suryabinayek).title("Suryabinayek"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Suryabinayek));
        mMap.addMarker(new MarkerOptions().position(MaitiGhar).title("MaitiGhar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(MaitiGhar));
        mMap.addMarker(new MarkerOptions().position(Lagankhel).title("Lagankhel"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Lagankhel));
        mMap.addMarker(new MarkerOptions().position(Chahabil).title("Chahabil"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Chahabil));
    }
}
