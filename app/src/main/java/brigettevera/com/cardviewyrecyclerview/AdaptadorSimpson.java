package brigettevera.com.cardviewyrecyclerview;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by BrigetteLorena on 28/10/2016.
 */
public class AdaptadorSimpson extends RecyclerView.Adapter<AdaptadorSimpson.ContenerdorGrafico> {

    List <Los_Simpson> losSimpsonMostrar;

    public AdaptadorSimpson(List<Los_Simpson> arrayDatos) {
        this.losSimpsonMostrar = arrayDatos;
    }

    @Override
    public ContenerdorGrafico onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_layout, parent, false);
        ContenerdorGrafico contenerdorGrafico = new ContenerdorGrafico(view);
        return contenerdorGrafico;
    }

    @Override
    public void onBindViewHolder(ContenerdorGrafico holder, int position) {

        holder.tituloNombre.setText(losSimpsonMostrar.get(position).getNombre());
        holder.textDescripcion.setText(losSimpsonMostrar.get(position).getDescripcion());
        holder.imageViewFoto.setImageResource(losSimpsonMostrar.get(position).getIdFoto());
    }

    @Override
    public int getItemCount() {
        return losSimpsonMostrar.size();
    }


    public static class ContenerdorGrafico extends RecyclerView.ViewHolder{

        TextView tituloNombre;
        TextView textDescripcion;
        ImageView imageViewFoto;
        CardView cardView;

        public ContenerdorGrafico(View itemView) {
            super(itemView);

            cardView = (CardView) itemView.findViewById(R.id.cardViewSimpson);
            tituloNombre = (TextView) itemView.findViewById(R.id.titlePersonaje);
            textDescripcion = (TextView) itemView.findViewById(R.id.textoPersonaje);
            imageViewFoto = (ImageView) itemView.findViewById(R.id.imagePersonaje);
        }
    }

}
