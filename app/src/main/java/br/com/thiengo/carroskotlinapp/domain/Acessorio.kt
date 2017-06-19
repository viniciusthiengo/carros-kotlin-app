package br.com.thiengo.carroskotlinapp.domain

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by viniciusthiengo on 19/06/17.
 */
data class Acessorio(
        val name: String,
        val preco: Float ) : Parcelable {

    companion object {
        @JvmField val CREATOR: Parcelable.Creator<Acessorio> = object : Parcelable.Creator<Acessorio> {
            override fun createFromParcel(source: Parcel): Acessorio = Acessorio(source)
            override fun newArray(size: Int): Array<Acessorio?> = arrayOfNulls(size)
        }
    }

    constructor(source: Parcel) : this(
    source.readString(),
    source.readFloat()
    )

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeString(name)
        dest.writeFloat(preco)
    }
}