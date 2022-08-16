import React from 'react'
import styled, { css } from 'styled-components';
import { deleteAttraction, editAttraction } from '../services/services';
import { Link } from 'react-router-dom'
import '../static/AttractionDetail.css'


import CommentList from '../containers/CommentList';
import { useState } from 'react';
// import StarRatings from './react-star-ratings';
import Rating from '@mui/material/Rating';


import { MapContainer, TileLayer, useMap, Marker, Popup } from 'react-leaflet'



const Button = styled.button`
background: transparent;
border-radius: 3px;
border: 2px solid #B96AC9;
color: #B96AC9;
margin: 0 1em;
padding: 0.25em 1em;

${props =>
        props.primary &&
        css`
  background: #B96AC9;
  color: white;
`};
`


const SelectedAttraction = ({ removeAttraction, attraction, goBackToList, locations, updateAttraction, comments, user, addNewComment }) => {



    const findAverageRating = () => {
        const filteredComments = comments.filter(comment => comment.attraction.id == attraction.id);

        let averageRating = filteredComments.reduce((acc, current) => (acc + current.rating), 0) / filteredComments.length;

        if (!averageRating) {
            averageRating = 3.5;
        }

        return averageRating;
    }

    const stars = findAverageRating();


    const handleDelete = () => {
        deleteAttraction(attraction.id).then(() => {
            removeAttraction(attraction.id);
        }).then(() => {
            goBackToList();
        })

    }

    const busList = attraction.busRoutes.map((bus) => {

        return <li>{bus}</li>

    })



    return (

        <>



            <div className='attraction-info'>



                <div className="vl"></div>



                <iframe className='image' width='350px' height='200px'
                    id="pic" src={attraction.image}
                    marginWidth="0" marginHeight="0" frameBorder="0" vspace="0" hspace="0">
                </iframe>
                <h1 className='detail-header'> {attraction.name}</h1>

                <div className="stars"><Rating name="read-only" value={stars} readOnly /></div>



                <p className='attraction-type'>{attraction.attractionType}</p>
                <p id='desc'>{attraction.description}</p>
                <hr className='line' />


                <p id='opening-hours'><p id='opening-hours-header'>OPENING HOURS:&nbsp;&nbsp;</p>{attraction.openingHours}</p>
                <hr className='line' />

                <p id='entry-heading'>ENTRY PRICES:</p>
                <p id='prices'>Adult: £{attraction.adultEntryPrice}&nbsp;  &nbsp; Child: £{attraction.childEntryPrice}</p>
                {/* <p> <b>Child:</b> £{attraction.childEntryPrice}</p> */}
                <p id='concession-price'>Concession: £{attraction.concessionEntryPrice}</p>


                {attraction.freeEntryForCarers ? <p id='carers'>Free for Carers</p> : null}

                <hr className='line' />

                <div>
                    <p>{attraction.isIndoors ? <b>Has Indoor Facilities</b> : null}</p>
                    <hr className='line' />

                </div>



                <div>
                    <p>{attraction.isBusy ? <b> Currently is Busy</b> : <b> Currently is Quiet</b>} </p>


                    <hr className='line' />
                </div>



                <p>Bus Routes:{busList}</p>



                <div>
                    {attraction.wheelchairAccessible ? <b>Wheelchair Accessible</b> : null}
                </div>
                <div>
                    {attraction.epilepsyFriendly ? <b>Epilepsy Friendly</b> : null}
                </div>
                <div>
                    {attraction.hasQuietRoom ? <b>Has A Quiet Room</b> : null}
                </div>
                <div>
                    {attraction.hasParking ? <b>Parking Available</b> : null}
                </div>
                <div>
                    {attraction.hasHeadphones ? <b>Sensory Headphones Available</b> : null}
                </div>





                <p> <b>Address:</b> {attraction.address}</p>
                <div id="map">
                    <MapContainer center={[attraction.latitude, attraction.longitude]} zoom={16} scrollWheelZoom={false}>

                        <TileLayer
                            attribution='&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
                            url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
                        />
                        <Marker position={[attraction.latitude, attraction.longitude]}>
                            <Popup>{attraction.name}</Popup>
                        </Marker>
                    </MapContainer>


                </div>








                <CommentList comments={comments} user={user} attraction={attraction} addNewComment={addNewComment} />

                <Button primary onClick={goBackToList}>Back</Button>


                <Button onClick={handleDelete}>Delete</Button>

                <Link to="/edit"><Button>Edit</Button></Link>

            </div>





        </>
    )
}

export default SelectedAttraction