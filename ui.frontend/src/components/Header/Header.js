import React from 'react';
import {MapTo} from '@adobe/aem-react-editable-components';
import PropTypes from 'prop-types';
require('./Header.css');

export const CustomEditConfig = {
       emptyLabel: 'Header',
       isEmpty: function(props) {
         return !props || !props.logo;
       }
};

export default function Header(props){
    if (CustomEditConfig.isEmpty(props)) {
        return null;
    }

     // Default to an empty array if props.link is undefined or not an array
        const links = Array.isArray(props.link) ? props.link : [];

    return (
        <div className="header">

            <nav>
                <a href="#"><img src={props.logo} alt="logo"/></a>
                <div className="nav-links" id="navLinks">
                {links.length > 0 ? (
                       links.map((item, index) => (
                           <ul key={index}>
                                <li><a href={item.url+".html"}>{item.name}</a></li>
                           </ul>
                       ))
                   ) : (<p>No links available</p>)}
                </div>
            </nav>
        </div>
    );
};


Header.propTypes = {
    logo: PropTypes.string,
    link: PropTypes.arrayOf(PropTypes.shape({
        name: PropTypes.string.isRequired,
        url: PropTypes.string.isRequired
    }))
};

Header.defaultProps = {
    link: []
};


MapTo('spa-react/components/content/header')(Header,CustomEditConfig);