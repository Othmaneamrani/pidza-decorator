import "./index.css";
import {useEffect, useState} from "react";
import {cheese, frite, getPizza, sauce, unCheese, unFrite, unSauce} from "./services";

export default function Home(){

    const [selectedOption, setSelectedOption] = useState("Margarita");
    const [suppFrites, setSuppFrites] = useState(false);
    const [suppSauce, setSuppSauce] = useState(false);
    const [suppCheese, setSuppCheese] = useState(false);
    const [prix, setPrix] = useState(0);
    const [pizza, setPizza] = useState();


    const handleSuppCheese = async (pizza) => {
        await cheese(pizza).then((resp) => setPizza(resp.data)
        ).catch((err) => console.log(err));
    }


    const handleUnSuppCheese = async (pizza) => {
        await unCheese(pizza).then((resp) => setPizza(resp.data)
        ).catch((err) => console.log(err));
    }


    const handleSuppFrites = async (pizza) => {
        await frite(pizza).then((resp) => setPizza(resp.data)
        ).catch((err) => console.log(err));
    }


    const handleUnSuppFrites = async (pizza) => {
        await unFrite(pizza).then((resp) => setPizza(resp.data)
        ).catch((err) => console.log(err));
    }




    const handleSuppSauce = async (pizza) => {
        await sauce(pizza).then((resp) => setPizza(resp.data)
        ).catch((err) => console.log(err));
    }


    const handleUnSuppSauce = async (pizza) => {
        await unSauce(pizza).then((resp) => setPizza(resp.data)
        ).catch((err) => console.log(err));
    }


    const handleChoisirPizza = async (type) => {
        const respose = await getPizza(type).then((resp) => {
            console.log(resp.data);
            setPizza(resp.data);
            setPrix(pizza.price);
        }).catch((err) => console.log(err));
    }

    useEffect(() => {
        if(pizza){
            setPrix(pizza.price);
        }
    }, [pizza]);


    return(
        <div className={"home-container"}>
            <h1 className={"choix"}>Choisir une pidza</h1>

            <div className={"drop"}>
                <select
                    className="remises-dropdown"
                    value={selectedOption}
                    onChange={(e) => setSelectedOption(e.target.value)}
                >
                    <option value="Margarita">Margarita</option>
                    <option value="QuatreFromages">Quatre Fromages</option>
                    <option value="Pepperoni">Pepperoni</option>
                </select>
            </div>


            <div className={"drop-box"}>
            <button onClick={() => handleChoisirPizza(selectedOption)} className={"btn-pizza"}>Choisir</button>
            </div>


            <br/>
            <h1 className={"choix"}>Choisir un supplément</h1>

            <div className={"drop-box"}>

                <label>Cheese</label>
                <input type="checkbox"
                       checked={suppCheese}
                       onChange={(e) => setSuppCheese(!suppCheese)}
                       onClick={() => {
                           if (suppCheese) {
                           handleUnSuppCheese(pizza);
                       } else {
                           handleSuppCheese(pizza);
                       }
                }}
                />

                <br/>

                <label>Frites</label>
                <input type="checkbox"
                       checked={suppFrites}
                       onChange={(e) => setSuppFrites(!suppFrites)}
                       onClick={() => {
                           if (suppFrites) {
                               handleUnSuppFrites(pizza);
                           } else {
                               handleSuppFrites(pizza);
                           }
                       }}
                />

                <br/>

                <label>Sauce</label>
                <input type="checkbox"
                       checked={suppSauce}
                       onChange={(e) => setSuppSauce(!suppSauce)}
                       onClick={() => {
                           if (suppSauce) {
                               handleUnSuppSauce(pizza);
                           } else {
                               handleSuppSauce(pizza);
                           }
                       }}
                />
            </div>


            <br/>

            <div className={"drop"}>

                <input className={"input-prix"}
                        type={"text"}
                        value={"Prix : " +prix + " Dhs"}
                       readOnly
                />
            </div>


        </div>
    );
}