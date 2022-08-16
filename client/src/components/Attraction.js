import React from 'react'
import { useState } from 'react'
import { editUser } from '../services/services';
import '../static/Attraction.css'

const Attraction = ({ attraction, attractions, user, changeSelectedAttraction, addToUserFavourites, index, deleteFromUserFavourites }) => {

    // const [inFaves, setInFaves] = useState(false);


    // Changes selectedAttraction state

    const handleClick = (event) => {
        const id = event.target.value;
        // console.log(index);
        changeSelectedAttraction(id);
    }

    // Adds to favourites state

    const handleFavourite = (event) => {
        const id = event.target.value;

        addToUserFavourites(id);

    }

    return (

        <>
        

        <div>
            <div className="individual-item">
                <img src={attraction.image} alt={attraction.name} width="280px" height="180px" />
                <p id="name">{attraction.name}</p>
            </div>
                
            <div className= "buttons">
                <button id="selectButton" onClick={handleClick} value={attraction.id}> Tell Me More</button>
                <button onClick={handleFavourite} value={attraction.id}>Add to Favourites</button>
            </div>

        </div>
        </>
    )
}

export default Attraction