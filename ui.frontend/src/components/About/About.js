import React from 'react';
import { MapTo } from '@adobe/aem-react-editable-components';
require('./About.css')
export const CustomEditConfig = {
  emptyLabel: 'About',

  isEmpty: function(props) {
    return !props || !props.aboutImg;
  }
};

export default function About(props) {
 console.log('About component props:', props);

  if (CustomEditConfig.isEmpty(props)) {
    return <div><h1>Hello</h1></div>;
  }
  return (
    <section className="about-us">
       <h1>{props.mainHeading}</h1>
      <div className="flex">
        <div className="about-col home-col-left">
          <h2>{props.subHeading}</h2> {/* Changed to h2 for subheading */}
          <p  dangerouslySetInnerHTML={{ __html: props.aboutText}} />
          <a href={props.aboutBtnLink+".html"} className="hero-btn red-btn">{props.aboutBtnTitle}</a>
        </div>
        <div
          className="about-col home-col-right"
          style={{ backgroundImage: `url(${props.aboutImg})`, backgroundSize: 'cover' }}
        >
        </div>
      </div>
    </section>
  );
}

MapTo('spa-react/components/content/about')(About, CustomEditConfig);
