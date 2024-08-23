import React from 'react';
import { MapTo } from '@adobe/aem-react-editable-components';
require('./Vision.css');

export const CustomEditConfig = {
    emptyLabel: 'Vision and Mission',
    isEmpty: function(props) {
        return !props || !props.vision;
    }
};

export default function Vision(props) {
    // Default to an empty array if props.vision is undefined or not an array
    const visionItems = Array.isArray(props.vision) ? props.vision : [];

    if (CustomEditConfig.isEmpty(props)) {
        return null;
    }

    return (
        <section className="vision">
            <div className="row clearfix">
                {visionItems.map((item, index) => (
                    <div className="col-md-6 tile-container" key={index}>
                        <div className="card">
                            <div className="card-image">
                                <img className="image_css" src={item.visionImg} alt={`Vision Item ${index}`} />
                            </div>
                            <div className="card-text">
                                <h4>{item.visionText}</h4>
                                <p>{item.visionDescription}</p>
                            </div>
                        </div>
                    </div>
                ))}
            </div>
        </section>
    );
}

MapTo('spa-react/components/content/vision')(Vision, CustomEditConfig);
