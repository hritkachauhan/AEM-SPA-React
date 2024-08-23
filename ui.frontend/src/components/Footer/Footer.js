import React from 'react';
import { MapTo } from '@adobe/aem-react-editable-components';
require('./Footer.css')
export const CustomEditConfig = {
    emptyLabel: 'Footer',
    isEmpty: function(props) {
        return !props || !props.footerHeading;
    }
};

export default function Footer(props) {


    if (CustomEditConfig.isEmpty(props)) {
        return null;
    }

    // Ensure footerLink is not undefined
    const footerItems = Array.isArray(props.footerLink) ? props.footerLink : [];

    return (
        <div className="copyright-area">
            <div className="footer">
                <div className="row" style={{ marginTop: '0px' }}>
                    <div className="col-xl-4 col-lg-4 text-center text-lg-left">
                        <div className="copyright-text">
                            <p>
                                {props.footerHeading}
                                <a href={props.infodalesLink+".html"}>{props.infodales}</a>
                            </p>
                        </div>
                    </div>

                    <div className="menu-flex">
                        {
                            footerItems.map((item, index) => (
                                <div className="footer-menu" style={{ marginTop: '10px' }} key={index}>
                                    <ul>
                                        <li><a href={item.footerUrl+".html"}>{item.footerName}</a></li>
                                    </ul>
                                </div>
                            ))


                       }
                   </div>
                   <div class="social-icons">

                         <a href="https://www.linkedin.com/company/infodales-tech-solution/" className="linkedin"><img src={props.iconImg1} alt="LinkedIn"/></a>
                         <a href="mailto:info@infodales.com" className="email"><img src={props.iconImg2} alt="Email"/></a>
                   </div>

                </div>
            </div>
        </div>
    );
}

MapTo('spa-react/components/content/footer')(Footer, CustomEditConfig);
