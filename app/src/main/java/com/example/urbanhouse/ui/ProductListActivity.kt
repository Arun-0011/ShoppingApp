package com.example.urbanhouse.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.urbanhouse.adapters.ProductAdapter
import com.example.urbanhouse.databinding.ActivityProductListBinding
import com.example.urbanhouse.models.ProductModel


class ProductListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProductListBinding
    private lateinit var productAdapter: ProductAdapter
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val productPosition = intent.extras?.getInt("product")
        val productType = intent.extras?.getString("type")
        recyclerView = binding.productListRecyclerview
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        val productList = ArrayList<ProductModel>()

        if (productType == "categories") {
            when (productPosition) {
                0 -> {
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/61-tZX1gYbL._AC_UL320_.jpg",
                            "Red Tape",
                            "Smile",
                            "1499"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/71YheJHZACL._SY879_.jpg",
                            "PUKHYA",
                            "Smile",
                            "999"
                        )
                    )

                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/51Bbxy09L1L._SY879_.jpg",
                            "KOTTY",
                            "Smile",
                            "1299"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/6104h7x0eUL._SX679_.jpg",
                            "Leriya Fashion",
                            "Smile",
                            "899"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/416C-0O0h3L.jpg",
                            "SANWARIYA SILKS",
                            "Smile",
                            "899"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/81mPu-rthSL._SX679_.jpg",
                            "RIGO",
                            "Smile",
                            "929"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/41Z5LwyIhCL.jpg",
                            "Selvia",
                            "Smile",
                            "1249"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/41yTSXlQ+FL.jpg",
                            "Selvia",
                            "Smile",
                            "1999"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/5168qJDu2zL._SY879_.jpg",
                            "FashFun clothing",
                            "Smile",
                            "1199"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/61+5kz4wt3L._SX679_.jpg",
                            "FashFun clothing",
                            "Smile",
                            "782"
                        )
                    )
                }

                1 -> {
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/71AOFwNPkeL._SX679_.jpg",
                            "GG Fashion",
                            "Smile",
                            "429"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/711A6wvWJiL._SY879_.jpg",
                            "SIGHTBOMB",
                            "Smile",
                            "449"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/91msjlh7SfL._SY879_.jpg",
                            "DHRUVI TRENDZ",
                            "Smile",
                            "399"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/41CxywOyyML.jpg",
                            "Dream Beauty Fashion",
                            "Smile",
                            "399"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/61vStqTvYSL._SY879_.jpg",
                            "ZUVINO",
                            "Smile",
                            "499"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/71Jz2YDle5L._SY879_.jpg",
                            "MIZAGO",
                            "Smile",
                            "499"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/81-OiPWQYeL._SY879_.jpg",
                            "SIRIL",
                            "Smile",
                            "599"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/714NWTx4JTL._SY879_.jpg",
                            "Istyle Can",
                            "Smile",
                            "599"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/71YbcLlZo-L._SY879_.jpg",
                            "Clothzy",
                            "Smile",
                            "629"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/51jUGm2tNbL.jpg",
                            "ICW",
                            "Smile",
                            "499"
                        )
                    )

                }

                2 -> {
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/61tODdzQ6AL._SY879_.jpg",
                            "FASHSTORE",
                            "Smile",
                            "1,299"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/617kZv+CelL._SX679_.jpg",
                            "Harpa",
                            "Smile",
                            "999"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/61zeFBPoU8L._SX679_.jpg",
                            "GRECIILOOKS",
                            "Smile",
                            "1,999"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/71cLoS-QpPL._SY879_.jpg",
                            "PURVAJA",
                            "Smile",
                            "799"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/71+Aychj6uL._SY879_.jpg",
                            "PUMA",
                            "Smile",
                            "1,249"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/61ShiYi37NL._SY879_.jpg",
                            "The Souled Store",
                            "Smile",
                            "1,049"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/613sV33ueKL._SY879_.jpg",
                            "SWAGGER JNS",
                            "Smile",
                            "489"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/31TqKlNDLHL.jpg",
                            "Generic",
                            "Smile",
                            "729"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/71n6NoQJzKL._SY879_.jpg",
                            "AUSK",
                            "Smile",
                            "807"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/31Hp3mLn9YL._SX679_.jpg",
                            "A to Z CREATION",
                            "Smile",
                            "679"
                        )
                    )
                }

                3 -> {
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/71VqWsems4L._SX679_.jpg",
                            "KLOSIA",
                            "Smile",
                            "749"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/61uZewIMi+L._SY879_.jpg",
                            "WNESY",
                            "Smile",
                            "749"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/81271aov+AL._SY879_.jpg",
                            "FIORRA",
                            "Smile",
                            "1,849"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/81dYpSPcIwL._SY879_.jpg",
                            "Naixa",
                            "Smile",
                            "1,049"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/71lkKHXJyOL._SY879_.jpg",
                            "Stylum",
                            "Smile",
                            "449"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/51dZ19miAbL._SY879_.jpg",
                            "GoSriKi",
                            "Smile",
                            "489"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/61+69uQf7FL._SY879_.jpg",
                            "Sanisa",
                            "Smile",
                            "889"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/71jR8PUrH4L._SY879_.jpg",
                            "Sidhidata",
                            "Smile",
                            "699"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/81P07gAB9PL._SX679_.jpg",
                            "Rajnandini",
                            "Smile",
                            "1,367"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/61NdfHKbR7L._SY879_.jpg",
                            "ANNI DESIGNER",
                            "Smile",
                            "589"
                        )
                    )

                }

                4 -> {
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/51fScVJw53L._SX679_.jpg",
                            "Bella Vita Luxury Rose Woman Eau De Perfume",
                            "Smile",
                            "589"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/61A0E5h8I9L._SX679_.jpg",
                            "Engage Verona Perfume",
                            "Smile",
                            "449"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/51wGlJIAR+L._SX679_.jpg",
                            "MINISO 100ML Dazzle EDT Eau the Parfum",
                            "Smile",
                            "504"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/31FvSzKZ9mL._SX300_SY300_QL70_FMwebp_.jpg",
                            "Carlton London Limited Edition Lush Eau de Parfum",
                            "Smile",
                            "766"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/51AS16dJ38L._SX679_.jpg",
                            "OSCAR OUD Lady Mini Pocket Perfume",
                            "Smile",
                            "899"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/81uoCK2vU9L._SX679_.jpg",
                            "Kanelle Luxury Perfume",
                            "Smile",
                            "1,299"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/71NRO4ULlcL._SX679_.jpg",
                            "Revlon Charlie Eau De Toilette Spray ",
                            "Smile",
                            "568"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/71zK+IF+NrL._SX522_.jpg",
                            "GUESS Seductive Woman Eau de Toilette",
                            "Smile",
                            "1,698"
                        )
                    )

                }

                5 -> {

                    productList.add(
                        ProductModel(
                            " https://m.media-amazon.com/images/I/71y3hHf2mjL._SY695_.jpg",
                            "Mochi",
                            "Smile",
                            "1,990"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/41Yr+9mBHqL._SY695_.jpg",
                            "Doctor Walk",
                            "Smile",
                            "1,99"
                        )
                    )

                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/613oardjw1L._SY695_.jpg",
                            "Generic",
                            "Smile",
                            "499"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/51ULLp-6E0L._SY675_.jpg",
                            "Mochi",
                            "Smile",
                            "619"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/61z3klxdljL._SY695_.jpg",
                            "Lino Perros",
                            "Smile",
                            "1,998"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/71J6100i+rL._SY695_.jpg",
                            "VRITRAZ",
                            "Smile",
                            "549"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/61pFtaE9qmL._SY695_.jpg",
                            "ZaHu",
                            "Smile",
                            "379"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/516PTxozD9L._SY695_.jpg",
                            "Bella Toes",
                            "Smile",
                            "649"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/61q4QstOuAL._SY695_.jpg",
                            "JM LOOKS",
                            "Smile",
                            "610"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/51KJ81XyigL._SX695_.jpg",
                            "HEALTH FIT",
                            "Smile",
                            "722"
                        )
                    )

                }

                6 -> {
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/61yZVaZjpTL._SX679_.jpg",
                            "Fastrack",
                            "Smile",
                            "1,663"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/714i-5WlvPL._SY879_.jpg",
                            "PAPIO",
                            "Smile",
                            "379"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/71KjjVqWQsL._SX679_.jpg",
                            "Fastrack",
                            "Smile",
                            "2,299"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/61V2AN2oyPL._SY879_.jpg",
                            "Giordano",
                            "Smile",
                            "3,180"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/51iafUyxGUL._SY879_.jpg",
                            "Acnos",
                            "Smile",
                            "2,180"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/71oCNMI1B1L._SY879_.jpg",
                            "ON TIME OCTUS",
                            "Smile",
                            "499"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/612jYMsjiRL._SX679_.jpg",
                            "ADAMO",
                            "Smile",
                            "549"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/61ejZ8XbIcL._SY879_.jpg",
                            "Fastrack",
                            "Smile",
                            "1149"
                        )
                    )


                }

                7 -> {
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/71xHKm9i82L._SY695_.jpg",
                            "Estele",
                            "Smile",
                            "1,049"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/61CGEfZmtzL._SY695_.jpg",
                            "Sukkhi",
                            "Smile",
                            "849"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/610JcHK2CnL._SY695_.jpg",
                            "YouBella",
                            "Smile",
                            "529"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/610JcHK2CnL._SY695_.jpg",
                            "YouBella",
                            "Smile",
                            "529"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/61wASh1CSrL._SY695_.jpg",
                            "YouBella",
                            "Smile",
                            "1,099"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/61Yf6Gbl-fL._SY695_.jpg",
                            "YouBella",
                            "Smile",
                            "298"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/81bDeCJQ0uL._SY695_.jpg",
                            "SAIYONI",
                            "Smile",
                            "328"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/71TS5BY5tfL._SY695_.jpg",
                            "Shining Diva Fashion",
                            "Smile",
                            "1,099"
                        )
                    )

                }

                8 -> {
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/71cEBNCJqCL._SX695_.jpg",
                            "NASHEMAN",
                            "Smile",
                            "3,299"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/81Uaf69-v4L._SY695_.jpg",
                            "ROSS BROWN",
                            "Smile",
                            "575"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/61NhaCR1UDL._SY695_.jpg",
                            "EXOTIC",
                            "Smile",
                            "1,207"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/91NZZEEzOxL._SY695_.jpg",
                            "Speed X Fashion",
                            "Smile",
                            "1,039"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/71tditpZCKL._SY695_.jpg",
                            "EXOTIC",
                            "Smile",
                            "1,102"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/81SRDNUx+kL._SY695_.jpg",
                            "Lavie",
                            "Smile",
                            "1,169"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/911y3t7YysL._SY695_.jpg",
                            "Lino Perros",
                            "Smile",
                            "1,349"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/51ONfN5i9QL._SY695_.jpg",
                            "ADISA",
                            "Smile",
                            "794"
                        )
                    )
                }

                9 -> {
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/613uP5jCjoL._SX679_.jpg",
                            "Enn Beauty Volume Up Hair Finishing Stick",
                            "Smile",
                            "369"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/71v31HdcFqL._SY695_.jpg",
                            "Yellow Chimes Crystal Bracelet",
                            "Smile",
                            "999"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/312XSonyEUL._SX300_SY300_QL70_FMwebp_.jpg",
                            "Revlon Colorstay Lip Liner",
                            "Smile",
                            "648"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/31wibxPPjaL._SX300_SY300_QL70_FMwebp_.jpg",
                            "Colorbar Blend-itude beauty sponge",
                            "Smile",
                            "140"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/61yJ5wejCAL._SX679_.jpg",
                            "Swiss Beauty Lip",
                            "Smile",
                            "230"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/61dMldTjtIL._SX679_.jpg",
                            "SWISS BEAUTY Matte Shiny Pearl Water Drop Blemish Long Lasting Balm Bb Lightweight, Liquid Foundation",
                            "Smile",
                            "249"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/61aQGkHIOdL._SX679_.jpg",
                            "HUDA ZONE Professional Waterproof HD Makeup Kit Combo",
                            "Smile",
                            "1,299"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/51KDtL5bMjL._SX679_.jpg",
                            "Maybelline Liquid Lipstick",
                            "Smile",
                            "799"
                        )
                    )

                }

                10 -> {
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/81ng3JbCBZL._SY695_.jpg",
                            "White Dual Beeded Cord Pearl Purses Shoulder Bag",
                            "Smile",
                            "1,799"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/71fbmT6PHuL._SX679_.jpg",
                            "Fire-Boltt Xelor Luxury Stainless Steel Smart Watch",
                            "Smile",
                            "2,349"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/7134Ds7j4dL._SX679_.jpg",
                            "GUCCI BLOOM EAU DE PARFUM",
                            "Smile",
                            "8,999"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/913ZML7udYL._SX695_.jpg",
                            "FLYING BERRY",
                            "Smile",
                            "2,595"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/61TED04B1bL._SX522_.jpg",
                            "Beauty Garage Professional Keratin Smooth Daily Shampoo",
                            "Smile",
                            "1,823"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/8101iv+UbmL._SY695_.jpg",
                            "H & M",
                            "Smile",
                            "2,999"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/71fqH2aS06L._SY695_.jpg",
                            "GUCCI",
                            "Smile",
                            "3,999"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/61MKOT1WDFL._SY695_.jpg",
                            "RED TAPE",
                            "Smile",
                            "5,999"
                        )
                    )
                }

            }
        } else {
            when(productPosition){
                0 -> {
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/71AOFwNPkeL._SX679_.jpg",
                            "GG Fashion",
                            "Smile",
                            "429"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/711A6wvWJiL._SY879_.jpg",
                            "SIGHTBOMB",
                            "Smile",
                            "449"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/91msjlh7SfL._SY879_.jpg",
                            "DHRUVI TRENDZ",
                            "Smile",
                            "399"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/41CxywOyyML.jpg",
                            "Dream Beauty Fashion",
                            "Smile",
                            "399"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/61vStqTvYSL._SY879_.jpg",
                            "ZUVINO",
                            "Smile",
                            "499"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/71Jz2YDle5L._SY879_.jpg",
                            "MIZAGO",
                            "Smile",
                            "499"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/81-OiPWQYeL._SY879_.jpg",
                            "SIRIL",
                            "Smile",
                            "599"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/714NWTx4JTL._SY879_.jpg",
                            "Istyle Can",
                            "Smile",
                            "599"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/71YbcLlZo-L._SY879_.jpg",
                            "Clothzy",
                            "Smile",
                            "629"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/51jUGm2tNbL.jpg",
                            "ICW",
                            "Smile",
                            "499"
                        )
                    )

                }
                1 -> {
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/61tODdzQ6AL._SY879_.jpg",
                            "FASHSTORE",
                            "Smile",
                            "1,299"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/617kZv+CelL._SX679_.jpg",
                            "Harpa",
                            "Smile",
                            "999"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/61zeFBPoU8L._SX679_.jpg",
                            "GRECIILOOKS",
                            "Smile",
                            "1,999"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/71cLoS-QpPL._SY879_.jpg",
                            "PURVAJA",
                            "Smile",
                            "799"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/71+Aychj6uL._SY879_.jpg",
                            "PUMA",
                            "Smile",
                            "1,249"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/61ShiYi37NL._SY879_.jpg",
                            "The Souled Store",
                            "Smile",
                            "1,049"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/613sV33ueKL._SY879_.jpg",
                            "SWAGGER JNS",
                            "Smile",
                            "489"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/31TqKlNDLHL.jpg",
                            "Generic",
                            "Smile",
                            "729"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/71n6NoQJzKL._SY879_.jpg",
                            "AUSK",
                            "Smile",
                            "807"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/31Hp3mLn9YL._SX679_.jpg",
                            "A to Z CREATION",
                            "Smile",
                            "679"
                        )
                    )
                }
                2 -> {
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/71cEBNCJqCL._SX695_.jpg",
                            "NASHEMAN",
                            "Smile",
                            "3,299"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/81Uaf69-v4L._SY695_.jpg",
                            "ROSS BROWN",
                            "Smile",
                            "575"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/61NhaCR1UDL._SY695_.jpg",
                            "EXOTIC",
                            "Smile",
                            "1,207"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/91NZZEEzOxL._SY695_.jpg",
                            "Speed X Fashion",
                            "Smile",
                            "1,039"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/71tditpZCKL._SY695_.jpg",
                            "EXOTIC",
                            "Smile",
                            "1,102"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/81SRDNUx+kL._SY695_.jpg",
                            "Lavie",
                            "Smile",
                            "1,169"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/911y3t7YysL._SY695_.jpg",
                            "Lino Perros",
                            "Smile",
                            "1,349"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/51ONfN5i9QL._SY695_.jpg",
                            "ADISA",
                            "Smile",
                            "794"
                        )
                    )
                }
                3 -> {
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/61yZVaZjpTL._SX679_.jpg",
                            "Fastrack",
                            "Smile",
                            "1,663"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/714i-5WlvPL._SY879_.jpg",
                            "PAPIO",
                            "Smile",
                            "379"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/71KjjVqWQsL._SX679_.jpg",
                            "Fastrack",
                            "Smile",
                            "2,299"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/61V2AN2oyPL._SY879_.jpg",
                            "Giordano",
                            "Smile",
                            "3,180"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/51iafUyxGUL._SY879_.jpg",
                            "Acnos",
                            "Smile",
                            "2,180"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/71oCNMI1B1L._SY879_.jpg",
                            "ON TIME OCTUS",
                            "Smile",
                            "499"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/612jYMsjiRL._SX679_.jpg",
                            "ADAMO",
                            "Smile",
                            "549"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/61ejZ8XbIcL._SY879_.jpg",
                            "Fastrack",
                            "Smile",
                            "1149"
                        )
                    )


                }
                4 -> {

                    productList.add(
                        ProductModel(
                            " https://m.media-amazon.com/images/I/71y3hHf2mjL._SY695_.jpg",
                            "Mochi",
                            "Smile",
                            "1,990"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/41Yr+9mBHqL._SY695_.jpg",
                            "Doctor Walk",
                            "Smile",
                            "1,99"
                        )
                    )

                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/613oardjw1L._SY695_.jpg",
                            "Generic",
                            "Smile",
                            "499"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/51ULLp-6E0L._SY675_.jpg",
                            "Mochi",
                            "Smile",
                            "619"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/61z3klxdljL._SY695_.jpg",
                            "Lino Perros",
                            "Smile",
                            "1,998"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/71J6100i+rL._SY695_.jpg",
                            "VRITRAZ",
                            "Smile",
                            "549"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/61pFtaE9qmL._SY695_.jpg",
                            "ZaHu",
                            "Smile",
                            "379"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/516PTxozD9L._SY695_.jpg",
                            "Bella Toes",
                            "Smile",
                            "649"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/61q4QstOuAL._SY695_.jpg",
                            "JM LOOKS",
                            "Smile",
                            "610"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/51KJ81XyigL._SX695_.jpg",
                            "HEALTH FIT",
                            "Smile",
                            "722"
                        )
                    )

                }
                5 -> {
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/613uP5jCjoL._SX679_.jpg",
                            "Enn Beauty Volume Up Hair Finishing Stick",
                            "Smile",
                            "369"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/71v31HdcFqL._SY695_.jpg",
                            "Yellow Chimes Crystal Bracelet",
                            "Smile",
                            "999"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/312XSonyEUL._SX300_SY300_QL70_FMwebp_.jpg",
                            "Revlon Colorstay Lip Liner",
                            "Smile",
                            "648"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/31wibxPPjaL._SX300_SY300_QL70_FMwebp_.jpg",
                            "Colorbar Blend-itude beauty sponge",
                            "Smile",
                            "140"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/61yJ5wejCAL._SX679_.jpg",
                            "Swiss Beauty Lip",
                            "Smile",
                            "230"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/61dMldTjtIL._SX679_.jpg",
                            "SWISS BEAUTY Matte Shiny Pearl Water Drop Blemish Long Lasting Balm Bb Lightweight, Liquid Foundation",
                            "Smile",
                            "249"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/61aQGkHIOdL._SX679_.jpg",
                            "HUDA ZONE Professional Waterproof HD Makeup Kit Combo",
                            "Smile",
                            "1,299"
                        )
                    )
                    productList.add(
                        ProductModel(
                            "https://m.media-amazon.com/images/I/51KDtL5bMjL._SX679_.jpg",
                            "Maybelline Liquid Lipstick",
                            "Smile",
                            "799"
                        )
                    )

                }

            }
        }
        productAdapter = ProductAdapter(this, productList)
        recyclerView.adapter = productAdapter


        productAdapter.productClick = {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("product",it)
            startActivity(intent)
        }
    }
}