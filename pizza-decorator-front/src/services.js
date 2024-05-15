import axios from "axios";

export const pizzaApi = axios.create({
    baseURL : "http://localhost:8080/pizza"
});


export const sauce = (pizza) => {
    return pizzaApi.put("/sauce",pizza);
}

export const unSauce = (pizza) => {
    return pizzaApi.put("/unsauce",pizza);
}



export const frite = (pizza) => {
    return pizzaApi.put("/frite",pizza);
}

export const unFrite = (pizza) => {
    return pizzaApi.put("/unfrite",pizza);
}




export const cheese = (pizza) => {
    return pizzaApi.put("/cheese",pizza);
}

export const unCheese = (pizza) => {
    return pizzaApi.put("/uncheese",pizza);
}


export const getPizza = (type) => {
    return pizzaApi.get(`/get?type=${type}`);
}